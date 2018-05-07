package com.dubber.java.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;

/**
 * Created on 2018/5/7.
 *
 * @author dubber
 */
public class ArrayBlockingQueueTest {
    public static void main(String[] args) {

        System.out.println("上课……");

        // capacity 4 ，默认为 fair false
        final ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(4, false);

        singleThreadQueue(queue);

        //multiThreadQueue(queue);

        System.out.println("队伍人数： " + queue.size());
        System.out.println("下课……");
    }


    //单线程操作
    private static void singleThreadQueue(ArrayBlockingQueue<String> queue) {
        /*queue.add("1");
        queue.add("1");
        System.out.println(queue.add("1"));
        System.out.println(queue.offer(""));
        System.out.println(queue.offer(""));*/

        queue.remove();
        queue.remove("1");
    }

    /**
     * 验证 多线程下 Queue 中方法的操作
     *
     * @param queue
     */
    private static void multiThreadQueue(final ArrayBlockingQueue<String> queue) {
        final CountDownLatch countDownLatch = new CountDownLatch(3);

        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try {
                        Thread.sleep(1 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1入队");
                    queue.add("1");
                }
            }).start();


            new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try {
                        Thread.sleep(1 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1出队");
                    queue.remove("1");
                }
            }).start();

           /* new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try {
                        Thread.sleep(1 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2入队");
                    queue.add("2");
                }
            }).start();*/

            new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try {
                        Thread.sleep(1 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2出队");
                    queue.remove("2");
                }
            }).start();


            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
