package OefenenDataZenders;

public class F1DataCenter1 {
    public static void main(String[] args) {
        AutoDataZender1 autoDataZender1 = new AutoDataZender1("Red bull auto 1", 2);
        AutoDataZender1 autoDataZender2 = new AutoDataZender1("Mercedes auto 2", 3);

        Thread thread1 = new Thread(autoDataZender1);
        Thread thread2 = new Thread(autoDataZender2);

        thread1.start();
        thread2.start();
    }
}
