package vezerlo;

import modell.JatekModell;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private JatekModell modell;
    private KonzolNezet nezet;

    public KonzolVezerlo(JatekModell modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
    }
    
    private void start(){
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
        nezet.bezar();
    }
    
}
