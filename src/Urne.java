public class Urne {
    private Kugel[] dieKugeln;
    private int anzahl;

    public Urne() {
        dieKugeln = new Kugel[49];
        anzahl = 49;
        for (int i = 0; i < anzahl; i++) {
            dieKugeln[i] = new Kugel(i+1);
        }
    }

    public Kugel ziehen() {
        int position = (int) (anzahl * Math.random());
        Kugel eineKugel = dieKugeln[position];
        for (int i = position; i < anzahl - 1; i++) {
            dieKugeln[i] = dieKugeln[i + 1];
        }
        anzahl--;
        return eineKugel;
    }
}
