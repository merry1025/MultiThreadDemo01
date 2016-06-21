package multithreaddemo01;

/**
 * This is the first demo for threading in Java.
 * 
 * It explains how to accomplish multi-threading by extends Treads class
 * Steps:
 * 1.MultiThread01 class extends Threads class
 * 2.Override run() method in MultiThread01 class
 * 3.Create new objects
 * 4.Start threads
 * 
 */


public class MultiThreadDemo01 {

    public static void main(String[] args) {
        MultiThread01 thread1 = new MultiThread01();
        MultiThread01 thread2 = new MultiThread01();
        MultiThread01 thread3 = new MultiThread01();
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        /*
        * Must use start() method to invoke multi-threading, NOT the run() method.
        * Must create individual objects in order to run each thread with start() method.
        */
    }    
}
