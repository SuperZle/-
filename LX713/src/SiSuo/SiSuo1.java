package SiSuo;

import DanLi.EHan;
import DanLi.LanHan;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:33
 * 2020
 */


public class SiSuo1 implements Runnable{

    int i=0;
    @Override
    public void run() {
        while (true){
            if (i%2==0) {
                synchronized (LanHan.fun()) {
                    System.out.println(Thread.currentThread().getName() + "  获取了懒锁,需要饿锁");
                    synchronized (EHan.fun()){
                        System.out.println(Thread.currentThread().getName()+ "获得了饿锁");

                    }
                }
            }
            synchronized (EHan.fun()) {
                System.out.println(Thread.currentThread().getName() + "  获取了懒锁,需要饿锁");
                synchronized (LanHan.fun()){
                    System.out.println(Thread.currentThread().getName()+ "获得了饿锁");

                }
            }
            i++;
        }
    }
}
