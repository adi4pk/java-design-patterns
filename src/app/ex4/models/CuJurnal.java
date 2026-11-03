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
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[JURNAL] catre SMS: " + mesaj);
        if (mesaj.length() > NotificatorSms.LUNGIME_MAXIMA) {
            throw new IllegalArgumentException("Message exceeds SMS length limit");
        }
        System.out.println("[SMS] " + mesaj);
    }
}
