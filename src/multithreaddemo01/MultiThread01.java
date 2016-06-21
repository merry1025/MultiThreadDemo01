package multithreaddemo01;

public class MultiThread01 extends Thread {

    @Override
    public void run() {
        for (int x = 0; x < 1000; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}
