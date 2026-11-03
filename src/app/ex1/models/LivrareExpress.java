package app.ex1.models;

public class LivrareExpress implements StrategyLivrare{

    @Override
    public String getNume() {
        return "EXPRESS";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm){

        double cost = 12 + 1.0 * greutateKg + 0.25 * distantaKm;

        return cost;
    }
}
