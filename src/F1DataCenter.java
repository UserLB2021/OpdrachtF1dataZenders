public class F1DataCenter {
    /* In deze klasse worden twee Zender instanties gemaakt;
       De twee Zender instanties hebben verschillende auto’s, bijvoorbeeld "Red bull auto 1" en "Mercedesauto 2"
       De twee Zender instanties hebben verschillende intervallen waarop ze meten;
       In de klasse worden de twee Zender instanties gestart op een manier waardoor ze concurrent draaien.*/
    public static void main(String[] args) {
        AutoDataZender zender1 = new AutoDataZender("Red bull auto 1", 2);
        AutoDataZender zender2 = new AutoDataZender("Mercedes auto 2", 3);

        Thread t1 = new Thread(zender1);
        Thread t2 = new Thread(zender2);

        t1.start();
        t2.start();
    }
}
/* In de main-methode maken we twee AutoDataZender-instanties aan met verschillende auto's en intervallen.
We maken ook twee Thread-instanties en geven de AutoDataZender-instanties door aan de Thread-constructor.
Vervolgens starten we beide threads met de start-methode.*/
