package app.ex1.models;

public class Comanda {
    private final String client;
    private final double greutateKg;
    private final double distantaKm;
    private final StrategyLivrare tip;

    public Comanda(String client, double greutateKg, double distantaKm, StrategyLivrare tip) {
        if (greutateKg <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (distantaKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        this.client = client;
        this.greutateKg = greutateKg;
        this.distantaKm = distantaKm;
        this.tip = tip;

    }

    public String getClient() {
        return client;
    }

    public StrategyLivrare getTip(){
        return tip;
    }



    public String numeLivrare() {
       return  tip.getNume();
    }

    public double cost() {
       return this.getTip().calculeazaCost(greutateKg,distantaKm);
    }
}
