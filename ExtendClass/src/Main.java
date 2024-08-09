
class A extends Thread{
    @Override
   public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("one");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class B extends Thread{
    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("two");
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

        A a = new A();
        B b = new B();

        a.start();


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        b.start();

    }
}

