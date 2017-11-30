public class SchiffTest {

    public SchiffTest() {

        Schiff schiff = new Schiff();
        int[] orte = { 2,3,4 };
        schiff.setZellorte(orte);
        String tipp = "2";
        String ergebnis = schiff.pruefDich(tipp);
        String testErgebnis = "Fehlgeschlagen";
        if (ergebnis.equals("Treffer")){
            testErgebnis = "Bestanden";
        }
        System.out.println(testErgebnis);
    }
}
