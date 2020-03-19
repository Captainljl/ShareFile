package com.soundai.loganalyse.asrproxy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

/**
 * @author: liujialei
 * @create: 2019-10-24 15:28
 **/
public class Analyse {

    public static String aimBasicMsg = "sentence request header is ";
    public static String aimResultMsg = "final result :";

    public static void main(String[] args) throws IOException {
        Analyse.display();
    }

    public static void display() throws IOException {
        String fileName="D:\\data\\logs\\asr-proxy\\tmp.log";
        //使用GZIPInputStream解压GZ文件
        InputStream in = new FileInputStream(fileName);
        Scanner sc=new Scanner(in);
        while(sc.hasNextLine()){
            WriteItem item = new WriteItem();
            String basicMsg = sc.nextLine();
            if (basicMsg != null && !"".equalsIgnoreCase(basicMsg) && basicMsg.contains(aimBasicMsg)) {
                item = analyse(basicMsg);
            }
            while (sc.hasNextLine()) {
                String resultMsg = sc.nextLine();
                if (resultMsg != null && !"".equalsIgnoreCase(resultMsg) && basicMsg.contains(aimResultMsg)) {
                    item.setResult(analyseResult(resultMsg));
                    break;
                }
            }
            writeTofile(item, "D:\\data\\logs\\abc.txt");
        }
    }

    private static String analyseResult (String resultStr) {
        return resultStr.substring(resultStr.indexOf(aimResultMsg) + aimResultMsg.length(), resultStr.length() - 11);
    }

    private static WriteItem analyse (String content) {
        String time = content.substring(1, 24);
        System.out.println(time);
        String jsonStr = content.substring(content.indexOf(aimBasicMsg) + aimBasicMsg.length());
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        JSONObject audioObject = jsonObject.getJSONObject("audio");
        JSONObject requestObject = jsonObject.getJSONObject("request");
        System.out.println(requestObject.getString("dialogId"));
        System.out.println(audioObject.getString("format"));
        WriteItem item = new WriteItem();
        item.setDialogId(requestObject.getString("dialogId"));
        item.setTime(time);
        item.setLanguage(audioObject.getString("language"));
        return item;
    }

    private static void writeTofile (WriteItem item, String fileName) {
        File file = new File(fileName);
    }

}
