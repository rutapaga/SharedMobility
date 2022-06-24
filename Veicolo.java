public class Veicolo {
    //attributi
    private static int contatore = 0;  //serve per creare un idveicolo univoco
    private int idveicolo;
    private String posizionegeografica;  //la registra quando un veicolo viene lasciato
    private boolean statoaffitto;
    private double tariffaalminuto;
    private boolean necessitacasco;

    //costruttore
    public Veicolo() {
        this.posizionegeografica = "Concessionaria";
        this.statoaffitto = true;
        this.idveicolo = contatore;
        contatore++;
    }

    //metodi
    public void setPosizionegeografica(String posizionegeografica) {
        this.posizionegeografica = posizionegeografica;
    }

    public String getPosizionegeografica() {
        return this.posizionegeografica;
    }

    public void setStatoaffitto(boolean statoaffitto) {
        this.statoaffitto = statoaffitto;
    }

    public boolean getStatoaffitto () {
        return this.statoaffitto;
    }

    public int getIdveicolo() {
        return this.idveicolo;
    }

    public void setNecessitacasco(boolean necessitacasco) {
        this.necessitacasco = necessitacasco;
    }

    public boolean getNecessitacasco () {
        return this.necessitacasco;
    }
}

