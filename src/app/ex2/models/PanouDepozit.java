package app.ex2.models;

public class PanouDepozit implements Observer{

//    public void pregateste(String stare) {
//        System.out.println("[DEPOZIT] Pregatesc pentru: " + stare);
//    }



    public void anunta(String stare){
        System.out.println("[DEPOZIT] Pregatesc pentru: " + stare);
    }
}
