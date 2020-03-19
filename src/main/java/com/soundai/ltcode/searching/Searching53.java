package com.soundai.ltcode.searching;

/**
 * @author: liujialei
 * @create: 2020-03-08 17:12
 **/
public class Searching53 {

    int time = 0;
    boolean isBadVersion(int version){
        System.out.println(version + " call " + time++);
        if (version < 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Searching53 searching53 = new Searching53();
        System.out.println(searching53.firstBadVersion(3));
    }

    public int firstBadVersion(int n) {
        if (n == 1) {
            if (isBadVersion(n)) {
                return n;
            } else {
                return -1;
            }
        }
        return firstBadVersion(n,1, n);
    }

    private int firstBadVersion(int n, int start, int end) {
        if (start == end) {
            if (isBadVersion(start)) {
                return start;
            } else {
                return -1;
            }
        }
        if (end - start == 1) {
            if (isBadVersion(start)) {
                return start;
            }
            if (isBadVersion(end)) {
                return end;
            }
        }
        int mid = (start + end) / 2;
        if (isBadVersion(mid)) {
            return firstBadVersion(n, start, mid);
        } else {
            return firstBadVersion(n, mid + 1 , end);
        }
    }

}
