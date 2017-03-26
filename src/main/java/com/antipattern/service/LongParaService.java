package com.antipattern.service;

import com.antipattern.get.GetResponse;

public class LongParaService {

    public void methodOne(int i, int a, double c, String name, GetResponse getResponse) {
        System.out.println("Method One");
    }

    public void methodTwo(GetResponse response, int a, int b) {
        System.out.println("Method two");
    }

    public void methodThree() {
        System.out.println("Method four");
    }

    public void methodFour(int i, int a, double c, String name, GetResponse getResponse1, GetResponse getRespons2){
        System.out.println("Method four");
    }

}
