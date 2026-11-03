package app.ex2.models;

public class NotificatorEmail implements Observer{

//    public void trimite(String stare) {
//        System.out.println("[EMAIL] Comanda a trecut in starea: " + stare);
//    }



    public void anunta(String stare){
        System.out.println("[EMAIL] Comanda a trecut in starea: " + stare);
    }
}
