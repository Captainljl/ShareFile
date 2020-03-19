package com.soundai.cs97.introduction;

import java.util.Scanner;

/**
 * @author: liujialei
 * @create: 2020-02-19 16:56
 **/
public class POJ1004 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += scan.nextFloat();
        }

        System.out.println(String.format("%.2f", sum / 12));

    }

}
