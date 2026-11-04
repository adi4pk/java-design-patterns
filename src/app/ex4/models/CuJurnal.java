package app.ex4.models;

public class CuJurnal implements Notificator {

    private Notificator interior;

    public CuJurnal(Notificator interior){
        this.interior = interior;
    }

    @Override
    public String getNume() {
        return interior.getNume() + " " + "+ Jurnal";
    }

    @Override
    public void trimite(String mesaj) {

        System.out.println("[JURNAL] catre"+interior.getNume()+": "+ mesaj);
        interior.trimite(mesaj);
    }
}
