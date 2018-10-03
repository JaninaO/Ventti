package ventti;

public class Kortti {

    private int arvo;
    private String maa;

    public Kortti(String maa, int arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return this.arvo;
    }

    public String getMaa() {
        return this.maa;
    }

    @Override
    public String toString() {
        return this.arvo + this.maa;
    }
}
