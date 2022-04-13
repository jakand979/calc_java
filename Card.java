public class Card{
    private int OBR;
    private int KON;
    private int STR;
    private int WPL;
    private int POD;
    private int REP;
    public Card() {
        OBR = 0;
        KON = 0;
        STR = 0;
        WPL = 0;
        POD = 0;
        REP = 0;
    }
    public int getOBR() {
        return OBR;
    }
    public void setOBR(int OBR) {
        this.OBR = OBR;
    }
    public int getKON() {
        return KON;
    }
    public void setKON(int KON) {
        this.KON = KON;
    }
    public int getSTR() {
        return STR;
    }
    public void setSTR(int STR) {
        this.STR = STR;
    }
    public int getWPL() {
        return WPL;
    }
    public void setWPL(int WPL) {
        this.WPL = WPL;
    }
    public int getPOD() {
        return POD;
    }
    public void setPOD(int POD) {
        this.POD = POD;
    }
    public int getREP() {
        return REP;
    }
    public void setREP(int REP) {
        this.REP = REP;
    }
    public void printOverall(){
        System.out.println("STR " + getSTR() + " KON " + getKON());
        System.out.println("POD " + getPOD() + " OBR " + getOBR());
        System.out.println("WPL " + getWPL() + " REP " + getREP());
    }
}
