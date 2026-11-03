package app.ex2.models;

public class JurnalLivrare implements Observer{



//    public void scrie(String stare) {
//        System.out.println("[LOG] Stare inregistrata: " + stare);
//    }

    public JurnalLivrare(){

    }

    public void anunta(String stare){
        System.out.println("[LOG] Stare inregistrata: " + stare);
    }
}
