class Mythread1 implements Runnable{

    public void run(){
        for (int i = 1; i<= 5; i++){
            System.out.println("YESS");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Mythread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i<= 5; i++){
            System.out.println("NOO");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

      Runnable mythread1 = new Mythread1();
      Runnable mythread2 = new Mythread2();

      Thread t1 = new Thread(mythread1);
      Thread t2 = new Thread(mythread2);

      t1.start();


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();

    }
}