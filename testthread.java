package com.msb.test02;

/**
 * 2.创建一个线程类
 */
public class testthread  extends Thread{
    //线程对应的任务放在run

    @Override
    public void run() {
        super.run();
    for (int i = 0; i <= 10; i++) {
        System.out.println("子线程--" + i);
    }
    }

}
