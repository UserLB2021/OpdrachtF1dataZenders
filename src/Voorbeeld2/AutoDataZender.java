package Voorbeeld2;

public class AutoDataZender implements Runnable {
    private String autoNaam;
    private int interval;

    public AutoDataZender(String autoNaam, int interval) {
        this.autoNaam = autoNaam;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("De motor van " + autoNaam + " functioneert nog goed!");
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                System.out.println("Thread onderbroken");

            }
        }

    }
}
/* De AutoDataZender klasse bevat een run() methode die de status van de motor van de auto print,
    // en vervolgens het interval wacht met behulp van de Thread.sleep() methode. */