package com.msb.test02;

public class test {
    public static void main(String[] args) {
        //1.main方法作为程序的入口，里面为主线程的任务
        for (int i = 0; i <= 10; i++) {
            System.out.println("main--i=" + i);}
            testthread t = new testthread();
            t.start();//一但线程启动，就会和主线程争夺资源
for (int i = 0; i <= 10; i++){
    System.out.println("mainmain--i=" + i);}

        }
    }


