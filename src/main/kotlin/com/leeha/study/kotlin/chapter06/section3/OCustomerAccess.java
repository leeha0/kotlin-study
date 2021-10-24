package com.leeha.study.kotlin.chapter06.section3;

public class OCustomerAccess {

    public static void main(String[] args) {
        // 코틀린 object 선언한 객체의 메서드 접근
        String name = OCustomer.INSTANCE.getName();
        System.out.println(name);
    }
}
