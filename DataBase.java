import com.sun.jdi.connect.Connector;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataBase {
    //attributi
    private int nAutomobili;
    private int nFurgoni;
    private int nScooter;
    private int nMonopattini;
    private int nBiciclette;
    private Automobile [] aAutomobili;
    private Furgone [] aFurgoni;
    private Scooter [] aScooter;
    private Monopattino [] aMonopattini;
    private Bicicletta [] aBiciclette;
    private ArrayList <String> idUtenti;
    private ArrayList <String> nomeUtenti;
    private ArrayList <String> cognomeUtenti;
    private ArrayList <LocalDate> dataDiNascita;
    private ArrayList <String> codiceFiscale;
   /* private Automobile automobile;
    private Furgone furgone;
    private Scooter scooter;
    private Monopattino monopattino;
    */

    //costruttori
    public DataBase (int nAutomobili,int nFurgoni, int nScooter, int nMonopattini, int nBiciclette) {
        this.nAutomobili=nAutomobili;
        this.nFurgoni=nFurgoni;
        this.nScooter=nScooter;
        this.nMonopattini=nMonopattini;
        this.nBiciclette=nBiciclette;
        this.aAutomobili=new Automobile [this.nAutomobili];
        this.aFurgoni= new Furgone [this.nFurgoni];
        this.aScooter=new Scooter [this.nScooter];
        this.aMonopattini= new Monopattino[this.nMonopattini];
        this.aBiciclette= new Bicicletta[this.nBiciclette];
    }


}
