public class Monopattino extends Veicolo{
    //attributi
    private int statoelettricita;

    //costruttori
    public Monopattino () {
        this.statoelettricita=100;
    }

    //metodi

    public void setStatoelettricita(int statoelettricita) {
        this.statoelettricita = statoelettricita;
    }

    public int getStatoelettricita() {
        return statoelettricita;

    }
}
