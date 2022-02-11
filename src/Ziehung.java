public class Ziehung {
    private Urne dieUrne;
    private int[] lottozahlen;
    private int zusatzzahl;

    public Ziehung() {
        dieUrne = new Urne();
        lottozahlen = new int[6];
        ziehen();
        sortieren();
    }

    private void sortieren() {
        for (int i = 0; i < lottozahlen.length; i++) {
            if (i + 1 < lottozahlen.length) {
                if (lottozahlen[i] > lottozahlen[i + 1]) {
                    int temp = lottozahlen[i];
                    lottozahlen[i] = lottozahlen[i + 1];
                    lottozahlen[i + 1] = temp;
                }
            } else {
                if (lottozahlen[0] > lottozahlen[1]) {
                    int temp = lottozahlen[0];
                    lottozahlen[0] = lottozahlen[1];
                    lottozahlen[1] = temp;
                    i = 0;
                }
            }

        }
    }

    public void ziehen() {
        for (int i = 0; i < lottozahlen.length; i++) {
            lottozahlen[i] = dieUrne.ziehen().getZahl();
        }
        zusatzzahl = dieUrne.ziehen().getZahl();
    }

    public int getLottozahl(int nr) {
        return lottozahlen[nr - 1];
    }

    public int getZusatzzahl() {
        return zusatzzahl;
    }
}