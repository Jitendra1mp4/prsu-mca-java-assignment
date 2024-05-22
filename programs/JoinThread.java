import myPack.Intro;

class Counter implements Runnable {
    char ch;
    Counter(char c) {
        ch = c;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%c%d\n", ch, i);
        }
        System.out.println("Executed thread " + ch);
    }
}

class AnotherThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i = " + i);
        }
        System.out.println("Executed AN THREAD");
    }
}

public class JoinThread {
    public static void main(String[] args) {
        Intro.print("Join function in multithreading");

        Thread ct1 = new Thread(new Counter('a'));
        Thread ct2 = new Thread(new Counter('b'));

        AnotherThread AN = new AnotherThread();
        AN.start();
        try {
            AN.join(2100); // thread name an will continue
                           // it's execution for 2100 ms then only another thread will get chance
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        ct1.start();
        ct2.start();
    }
}