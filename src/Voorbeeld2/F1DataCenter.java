package Voorbeeld2;

public class F1DataCenter {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new AutoDataZender("Red bull auto 1", 5));
        Thread thread2 = new Thread(new AutoDataZender("Mercedes auto 2", 3));

        thread1.start();
        thread2.start();
    }
}
// De F1DataCenter klasse maakt twee Thread objecten.
// Hierdoor wordt het object direct gestart op een nieuwe thread,
// en hoeft het niet apart gestart te worden met een Thread.start() methode