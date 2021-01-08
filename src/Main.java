import model.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1=new NumberGenerator();
        NumberGenerator numberGenerator2=new NumberGenerator();
        Thread t1=new Thread(numberGenerator1);
        Thread t2=new Thread(numberGenerator2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
