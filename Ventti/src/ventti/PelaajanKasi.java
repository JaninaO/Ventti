
package ventti;

import java.util.ArrayList;


public class PelaajanKasi {
    private ArrayList<Kortti> kortit;

    public PelaajanKasi() {
        this.kortit = new ArrayList<>();
    }
    public void otaKortti(Kortti pelaajanKortti) {
        this.kortit.add(pelaajanKortti);
    }
    public int selvitaSumma() {
        int summa = 0;
        for (Kortti pelaajanKortti : this.kortit) {
            summa += pelaajanKortti.getArvo();
        }
        return summa;
    }
    public void onkoVentti() {
        int korttienMaara = 0;
        for (Kortti maara : this.kortit) {
            korttienMaara++;
            if (korttienMaara == 2) {
        }
    }
}
