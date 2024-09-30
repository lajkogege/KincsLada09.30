package modell;

public class JatekModell {
    private Lada[] ladak;
    private int valasztas;

    public JatekModell() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arnay", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset!");
        ladak[2] = new Lada("bronz", "Az arany hazudik!");
        /*ezt is lehetne:*/
        ladak[1].kincsetElhelyez();
        megjelenit(kezdes());
        bekeres();
        ellenorzes();
        vege();
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik állitás igaz!";
        int i = 1;
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag();
            String felirat = lada.getFelirat();
            String f = lada.getFelirat();
            s += i++ + "." + "lada:" + f + "\n";
        }
        return s;
    }



    private String ellenorzes() {
        String s = "Gratulálok, eltaláltad!";
        s = ladak[valasztas].isKincs() ? s : "Sajnos nem talált!";
        return s;
        /*Mellékhatás, az ellenőrzés be is zárja a scannert, de erről nem értesit*/
        //sc.close();
    }

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }

    private void vege() {
       //sc.close(); //bezárja a scenert 
    }
}
