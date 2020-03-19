package com.soundai.cs97.introduction;

import java.util.Scanner;

/**
 * @author: liujialei
 * @create: 2020-02-19 16:30
 **/
public class POJ1000 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] strings = inputString.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        System.out.println(a + b);


    }

}
