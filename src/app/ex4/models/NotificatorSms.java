package app.ex4.models;

public class NotificatorSms implements Notificator {
    public static final int LUNGIME_MAXIMA = 30;


    public NotificatorSms(){

    }


    @Override
    public String getNume() {
        return "SMS";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        if (mesaj.length() > LUNGIME_MAXIMA) {
            throw new IllegalArgumentException("Message exceeds SMS length limit");
        }
        System.out.println("[SMS] " + mesaj);
    }
}
