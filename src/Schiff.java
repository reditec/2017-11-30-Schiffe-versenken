public class Schiff {

    private int[] zellorte;
    private int anzahlTreffer;

    public String pruefDich(String tipp){
        int t = Integer.parseInt(tipp);

        for (int zelle : zellorte){
            if (t == zelle){
                anzahlTreffer++;

                if(anzahlTreffer == zellorte.length){
                    return "Versenkt";
                }else{
                    return "Treffer";
                }
            }
        }
        return "Vorbei";
    }

    public void setZellorte(int[] zellorte){
        this.zellorte = zellorte;
    }
}
