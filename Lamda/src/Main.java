public class Main {
    public static void main(String[] args) {
        Runnable one = () ->{
            for (int i =1; i<=5; i++){
                System.out.println("one");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable two = () ->{
            for (int i =1; i<=5; i++){
                System.out.println("two");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);


        t1.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();

    }
}