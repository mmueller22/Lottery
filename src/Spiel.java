public class Spiel {

    private int[] tipp;
    private Ziehung eineZiehung;

    public Spiel (int T1, int T2, int T3, int T4, int T5, int T6) {
        int[] tempArray = new int[]{T1, T2, T3, T4, T5, T6};
        for (int i = 0; i < tempArray.length; i++) {
            if (i + 1 < tempArray.length) {
                if (tempArray[i] > tempArray[i + 1]) {
                    int temp = tempArray[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArray[i + 1] = temp;
                }
            } else {
                if (tempArray[0] > tempArray[1]) {
                    int temp = tempArray[0];
                    tempArray[0] = tempArray[1];
                    tempArray[1] = temp;
                    i = 0;
                }
            }

        }
        tipp = tempArray;
        eineZiehung = new Ziehung();
        for (int i = 0; i < 6; i++) {
            System.out.println(eineZiehung.getLottozahl(i));
        }
    }
    public String getGewinn () {
        int gewinn = 0;
        boolean zusatzzahlvorhanden = false;
        for (int i = 0; i < tipp.length; i++){
            if (tipp[i] == eineZiehung.getLottozahl(i)) {
                if (eineZiehung.getLottozahl(i) == eineZiehung.getZusatzzahl()) {
                    zusatzzahlvorhanden = true;
                }
                gewinn++;
            }
        }
        if (zusatzzahlvorhanden) {
            return String.format("Sie haben %d Richtige mit Zusatzzahl", gewinn);
        } else {
            return String.format("Sie haben %d Richtige", gewinn);
        }
    }
    public String getLottozahl(int nr) {
        return String.valueOf(eineZiehung.getLottozahl(nr - 1));
    }
    public String getUserTip(int nr) {
        return String.valueOf(tipp[nr-1]);
    }
    public String getZusatzzahl() {
        return String.valueOf(eineZiehung.getZusatzzahl());
    }
}
