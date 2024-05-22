class ConcurrentFun extends Thread {
    char c;
    ConcurrentFun(char c) {
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(c + " = " + i);
        }
        System.out.println("Finished " + c);
    }
}

public class MultiThreading {
    public static void main(String args[]) {
        ConcurrentFun f1 = new ConcurrentFun('i');
        ConcurrentFun f2 = new ConcurrentFun('k');
        f1.start();
        f2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("m = " + i);
        }
        System.out.println("Finished Main");
    }
}