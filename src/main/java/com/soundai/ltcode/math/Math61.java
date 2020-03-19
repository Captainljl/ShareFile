package com.soundai.ltcode.math;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-03-09 22:24
 **/
public class Math61 {

    public static void main(String[] args) {
        Math61 math61 = new Math61();
        System.out.println(math61.countPrimes(10));
    }

    public int countPrimes(int n) {
        //查看每个位置是不是质数
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i*i < n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }



}
