package modell;

public class Lada {

    private String anyag, felirat;
    private boolean kincs;

    public Lada(String anyag, String felirat) {
        this(anyag, felirat, false);
    }

    public Lada(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    /*CleanCode: bool paramétert inkább 2 metódusba:
    public void setKincs(boolean kincs){
    this.kincs=kincs;
    }
     */
    public void kincsetElhelyez() {
        kincs = true;
    }

    public void kincsetKivesz() {
        kincs = false;
    }

    boolean isKincs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
