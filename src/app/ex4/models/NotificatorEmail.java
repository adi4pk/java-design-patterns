package app.ex4.models;

public class NotificatorEmail implements Notificator {

    public NotificatorEmail(){
        
    }


    @Override
    public String getNume() {
        return "Email";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[EMAIL] " + mesaj);
    }
}
