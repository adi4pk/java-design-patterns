package app.ex5.models;

public class Comanda {
    private  String client;
    private  String adresa;
    private  String nota;
    private  String cupon;
    private  boolean express;
    private  boolean cadou;

    private Comanda(Builder builder) {
        this.client = builder.client;
        this.adresa = builder.adresa;
        this.nota = builder.nota;
        this.cupon = builder.cupon;
        this.express = builder.express;
        this.cadou = builder.cadou;

    }

    //static -> class can be used without instantiating an object Builder
    public static class Builder{
        private String client;
        private String adresa;
        private String nota;
        private String cupon;
        private boolean express;
        private boolean cadou;

        public Builder setClient(String client){
            this.client = client;
            return this;
        }

        public Builder setAdresa(String adresa){
            this.adresa = adresa;
            return this;
        }

        public Builder setNota(String nota){
            this.nota = nota;
            return this;
        }

        public Builder setCupon(String cupon){
            this.nota = nota;
            return this;
        }

        public Builder setExpress(Boolean express){
            this.express = express;
            return this;
        }

        public Builder setCadou(Boolean cadou){
            this.cadou = cadou;
            return this;
        }


        public Comanda build(){

            if(client == null || client.isBlank()){
                throw new IllegalArgumentException("Client name is required");
            }

            if (adresa == null || adresa.isBlank()) {
            throw new IllegalArgumentException("Address is required");
        }

            if (cadou && (nota == null || nota.isBlank())) {
            throw new IllegalArgumentException("Gift wrap requires a note");
        }

            return new Comanda(this);
        }

    }





    public String getClient() {
        return client;
    }

    public void setClient(String client){
        this.client = client;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }

    public void setExpress(boolean express) {
        this.express = express;
    }

    public void setCadou(boolean cadou) {
        this.cadou = cadou;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNota() {
        return nota;
    }

    public String getCupon() {
        return cupon;
    }

    public boolean isExpress() {
        return express;
    }

    public boolean isCadou() {
        return cadou;
    }

    public String descriere() {
        String text = "Comanda " + client + " -> " + adresa;
        if (nota != null) {
            text += " | nota: " + nota;
        }
        if (cupon != null) {
            text += " | cupon: " + cupon;
        }
        if (express) {
            text += " | express";
        }
        if (cadou) {
            text += " | cadou";
        }
        return text;
    }
}
