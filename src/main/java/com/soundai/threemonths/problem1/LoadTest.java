package com.soundai.threemonths.problem1;

public class LoadTest {

    public LoadTest () {
        System.out.println(this.getClass().getSimpleName() + " loaded!");
    }

    public static String str = "ab";

    public static String getString () {
        return str;
    }

}
