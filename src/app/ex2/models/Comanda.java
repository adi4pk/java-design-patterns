package app.ex2.models;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private final String client;
    private String stare;
//    private final NotificatorEmail email = new NotificatorEmail();
//    private final JurnalLivrare jurnal = new JurnalLivrare();
//    private final PanouDepozit depozit = new PanouDepozit();

    private List<Observer> observerArr = new ArrayList();

    public Comanda(String client) {
        if (client == null || client.isBlank()) {
            throw new IllegalArgumentException("Client cannot be empty");
        }
        this.client = client;
        this.stare = "Plasata";
    }

    public String getClient() {
        return client;
    }

    public String getStare() {
        return stare;
    }

    public void schimbaStare(String stareNoua) {
        if (stareNoua == null || stareNoua.isBlank()) {
            throw new IllegalArgumentException("State cannot be empty");
        }
        if (stareNoua.equals(stare)) {
            return;
        }
        this.stare = stareNoua;


        for (Observer observer:observerArr){
            observer.anunta(stare);
        }

//        email.trimite(stareNoua);
//        jurnal.scrie(stareNoua);
//        depozit.pregateste(stareNoua);
    }

    public void aboneazaObserver(Observer observer){
        observerArr.add(observer);
    }

    public void dezaboneazaObserver(Observer observer){
        observerArr.remove(observer);
    }
}
