package com.soundai.cs97.introduction;

import java.util.Scanner;

/**
 * @author: liujialei
 * @create: 2020-02-19 17:24
 **/
public class POJ1003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextFloat()) {

            float input = scan.nextFloat();

            if (input == 0) {
                return;
            }

            int cards = 1;
            for (float sum = 0; input > sum; ) {

                cards++;
                float adder = (float) (1.0 / cards);
                sum += adder;

            }
            System.out.println(--cards + " card(s)");

        }
    }
}
