package com.soundai;

import java.io.IOException;
import java.util.Set;

/**
 * @author: liujialei
 * @create: 2019-11-02 11:59
 **/
public class TestMain {

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.fun();
    }

    private void fun () {
        throw new RuntimeException("");
    }

}
