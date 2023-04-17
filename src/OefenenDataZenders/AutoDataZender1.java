package OefenenDataZenders;

public class AutoDataZender1 implements Runnable {

    private String autoNaam;
    private int interval;

    public AutoDataZender1(String autoNaam, int interval) {
        this.autoNaam = autoNaam;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("De motor van " + autoNaam + " functioneert nog goed!");
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
