package app.ex4.models;

public class CuTrunchiere implements Notificator {
    private final int lungimeMaxima;
    private Notificator interior;

    public CuTrunchiere(int lungimeMaxima, Notificator interior) {
        if (lungimeMaxima <= 0) {
            throw new IllegalArgumentException("Length limit must be positive");
        }
        this.lungimeMaxima = lungimeMaxima;
        this.interior = interior;
    }

    @Override
    public String getNume() {
        return interior.getNume() + " " + "+ trunchiere";
    }

    @Override
    public void trimite(String mesaj) {
        if(mesaj!=null&&mesaj.length()>lungimeMaxima){
            interior.trimite(mesaj.substring(0,lungimeMaxima));
        }else{
            interior.trimite(mesaj);
        }

    }
}
