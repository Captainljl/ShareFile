package com.soundai.ltcode.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-03-10 10:52
 **/
public class Other67 {

    public static void main(String[] args) {
        Other67 other67 = new Other67();
        List<List<Integer>> generate = other67.generate(7);
        for (List<Integer> integers : generate) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<> ();
            if (i == 0) {
                list.add(1);
            } else {
                List<Integer> temp = ret.get(i - 1);
                list = getList(temp);
            }
            ret.add(list);
        }
        return ret;
    }

    private List<Integer> getList(List<Integer> temp) {
        List<Integer> list = new ArrayList<> ();
        list.add(1);
        for (int i = 1; i < temp.size(); i++) {
            list.add(temp.get(i-1) + temp.get(i));
        }
        list.add(1);
        return list;
    }

}
