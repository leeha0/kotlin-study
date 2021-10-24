package com.leeha.study.kotlin.chapter06.section3;

public class KCustomerAccess {

    public static void main(String[] args) {
        // 코틀린 클래스의 컴패니언 객체 접근
        System.out.println(KCustomer.LEVEL);
        // 애노테이션 사용시 접근 방법
        KCustomer.login();
        // 애노테이션 미사용시 접근 방법
        KCustomer.Companion.login();

        // KJob에 대한 객체 생성 후 접근
        KJob kjob = KCustomer.JOB;
        System.out.println(kjob.getTitle());

        // KCustomer를 통한 접근
        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
