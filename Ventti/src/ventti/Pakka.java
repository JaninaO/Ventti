package ventti;

import java.util.ArrayList;
import java.util.Random;

public class Pakka {

    private ArrayList<Kortti> pakka;

    public Pakka() {
        this.pakka = new ArrayList<Kortti>();

        for (int m = 0; m < 4; m++) {
            for (int a = 2; a <= 14; a++) {
                pakka.add(new Kortti("" + m, a));
            }

        }
    }

    public void sekoita() {
        ArrayList<Kortti> tmpPakka = new ArrayList<Kortti>();
        Random random = new Random();
        int randomKortti = 0;
        int alkuperainenKoko = this.pakka.size();
        for (int i = 0; i < alkuperainenKoko; i++) {
            randomKortti = random.nextInt((this.pakka.size() - 1 - 0) + 1) + 0;
            tmpPakka.add(this.pakka.get(randomKortti));
            this.pakka.remove(randomKortti);
        }
        this.pakka = tmpPakka;
    }

}
