package app.ex4.models;

public class CuPrefix implements Notificator {
    private final String prefix;
    private Notificator interior;

    public CuPrefix(String prefix, Notificator interior) {
        if (prefix == null || prefix.isEmpty()) {
            throw new IllegalArgumentException("Prefix cannot be empty");
        }
        this.prefix = prefix;
        this.interior = interior;

    }

    @Override
    public String getNume() {
        return interior.getNume() + " + " + "prefix";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[EMAIL] " + prefix +" " + mesaj);
    }
}
