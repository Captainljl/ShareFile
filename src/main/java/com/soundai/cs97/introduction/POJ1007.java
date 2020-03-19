package com.soundai.cs97.introduction;

import java.util.*;

/**
 * @author: liujialei
 * @create: 2020-02-20 17:44
 **/
public class POJ1007 {
    private void calculNum(List<String> dataList) {
        Map resultMap = new TreeMap();
        for (String oneData : dataList) {
            int num = 0;
            String[] split = oneData.split("_");
            for (int i = 0; i < split[1].length(); i++) {
                for (int j = i + 1; j < split[1].length(); j++) {
                    if (split[1].charAt(i) > split[1].charAt(j)) {
                        num++;
                    }
                }
            }
            resultMap.put(oneData, num);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(resultMap.entrySet());
        Collections.sort(entryList, new MapValueComparator());
        for (Map.Entry<String, Integer> stringIntegerEntry : entryList) {
            System.out.println(stringIntegerEntry.getKey().split("_")[1]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int line = Integer.parseInt(s.split(" ")[1]);
        List<String> dataList = new ArrayList<String>();
        for (int i = 0; i < line; i++) {
            dataList.add(i + "_" +sc.nextLine());
        }
        POJ1007 dnaSort = new POJ1007();
        dnaSort.calculNum(dataList);
    }

    class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> me1, Map.Entry<String, Integer> me2) {

            if (me1.getValue() > me2.getValue()) {
                return 1;
            } else if (me1.getValue().intValue() == me2.getValue().intValue()) {
                if (Integer.parseInt(me1.getKey().split("_")[0]) < Integer.parseInt(me2.getKey().split("_")[0])){
                    return -1;
                }else {
                    return 1;
                }
            } else {
                return -1;
            }
        }
    }
}
