/*De klasse AutoDataZender
• De instanties van de Zender runnen op een thread;
• Elke zender is van een bepaalde auto, de naam van de auto wordt meegeven tijdens het aanmaken;
• Elke instantie van Zender heeft een eigen interval die aangeeft hoe lang in seconden de zender wacht tussen elke meeting,
deze wordt ook meegegeven bij het aanmaken;
• Op het moment dat de Zender een meeting moet doen zal het printen:
“De motor van {auto naam hier} functioneert nog goed!”
• De Zender meet oneindig lang.*/

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
            System.out.println("De motor van " + autoNaam + " functioneert nog goed!");
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* De klasse AutoDataZender-klasse moet de status van de motor van de auto printen op een bepaald interval.
            Je kunt dit doen met behulp van de Runnable-interface en de Thread-klasse.
        /* In de run-methode hebben we een oneindige lus die de status van de motor afdrukt en vervolgens wacht op het interval dat is opgegeven.
        We gebruiken 'Thread.sleep()' om de thread te laten slapen voor de aangegeven intervaltijd.
        */

    }
}
