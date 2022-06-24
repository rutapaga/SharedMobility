import java.util.ArrayList;

public class VeicoloImmatricolato extends Veicolo {
    //attributi
    private String targa;   //la targa gliela inserisci dal database quando crei tutte le macchine1
    private int statocarburante;
    private String patente;

    //costruttori
    public VeicoloImmatricolato () {
        this.statocarburante=100;
    }
    public VeicoloImmatricolato (String targa) {
        this.targa=targa;
        this.statocarburante=100;
    }



    //metodi
    public String getTarga(){
        return this.targa;
    }

    public void setTarga(String targa) {
        this.targa=targa;
    }

    public void setStatocarburante (int statocarburante) {
        this.statocarburante=statocarburante;
    }

    public int getStatocarburante () {
        return this.statocarburante;
    }

    public void setPatente (String patente) {
        if (patente.equals("A")||patente.equals("B"))
            this.patente=patente;
        else
            System.out.println("La patente inserita non è valida");
    }

    public String getPatente() {
        return this.patente;
    }
}