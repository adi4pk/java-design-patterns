package app.ex1.models;

public class LivrareGratuita implements StrategyLivrare{


    @Override
    public String getNume() {
        return "GRATUITA";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm){

        return 0;
    }
}
