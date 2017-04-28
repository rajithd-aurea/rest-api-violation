package com.antipattern.service;

/**
 * Created by rajith on 3/30/17.
 */
public class CommentService {

    private String call;

    /**
     * test1 test2 test3 test4 test5
     */
    public void method1() {
        System.out.println("aaa");
    }

    /**
     * test6 test7 test8 test9 test10
     */
    public void method2() {
        System.out.println("aaa");
    }

    public void method3() {
        System.out.println("aaa");
    }

    public void disconnect() {
        // Calling disconnect() before a connection exists should have no effect.
        if (call == null) {
            return;
        }

        new LongMethodService().m1(); // Unblock any waiting async thread.
        call.length();
    }

    public void method4() {
        // comment 1
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa"); //comment 2
        System.out.println("aaa"); // comment 3
        System.out.println("aaa"); // comment 4
    }

}
