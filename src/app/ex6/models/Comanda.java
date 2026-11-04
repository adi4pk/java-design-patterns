package app.ex6.models;

public class Comanda {
    private final int numar;
    private final String client;

    public Comanda(String client) {
        if (client == null || client.isBlank()) {
            throw new IllegalArgumentException("Client is required");
        }
        this.client = client;
        this.numar = GeneratorNumere.getInstance().urmatorul();
    }

    public int getNumar() {
        return numar;
    }

    public String descriere() {
        return "Comanda #" + numar + " " + client;
    }
}
