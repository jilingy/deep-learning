package com.jilingy.deep.learning.base.yellowcar;

import cn.hutool.core.date.DateUtil;

import java.util.Arrays;
import java.util.Date;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-12-17
 */
public class Client {
    public static int timeBySecond = 0 ;

    public static Station A = new Station("A",    30, "0,0");
    public static  Station B = new Station("B", 40, "7,7");
    public static Station C = new Station("C", 30, "2,3");

    public static synchronized void a() {
        timeBySecond++;
        int currentCarNumberFromA = A.getCarNumber()-1;
        A.setCarNumber(currentCarNumberFromA);
        System.out.println(DateUtil.secondToTime(timeBySecond)+" A 站车 "+ A.getCarNumber() + "，B 站车 "+B.getCarNumber()+"，C 站车 "+C.getCarNumber()+
                "，路上车 " + 0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void b() {
        timeBySecond++;
        int currentCarNumberFromB = B.getCarNumber()-1;
        A.setCarNumber(currentCarNumberFromB);
        System.out.println(DateUtil.secondToTime(timeBySecond)+" A 站车 "+ A.getCarNumber() + "，B 站车 "+B.getCarNumber()+"，C 站车 "+C.getCarNumber()+
                "，路上车 " + 0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void c() {
        timeBySecond++;
        int currentCarNumberFromC = C.getCarNumber()-1;
        C.setCarNumber(currentCarNumberFromC);
        System.out.println(DateUtil.secondToTime(timeBySecond)+" A 站车 "+ A.getCarNumber() + "，B 站车 "+B.getCarNumber()+"，C 站车 "+C.getCarNumber()+
                "，路上车 " + 0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Thread a = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                a();
            }
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                b();
            }
        });

        Thread c = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                c();
            }
        });
        a.start();
        b.start();
        c.start();

    }
}
