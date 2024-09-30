package nezet;

import java.util.Scanner;
import modell.JatekModell;

public class KonzolNezet {

    private static final Scanner sc = new Scanner(System.in);

    private int bekeres() {
        System.out.println("Melyikben van a kincs? (1,2,3)?");
        return sc.nextInt();
        /*FONTOS: bekérésnél meg is kell nyitni!!!
        //sc.close(); //Kilépésnél fel GC felszabadít
         */
    }

    public void megjelenit(String uzenet) {
        System.out.println(uzenet);

    }
    
    public void bezar(){
            }
}
