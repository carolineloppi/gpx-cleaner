package modelo;


public class Ponto {
    private double latitude;
    private double longitude;
    private double elevacao;
    private String tempo;

    public Ponto(double latitude, double longitude, double elevacao, String tempo){
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevacao = elevacao;
        this.tempo = tempo;
    }
    
    public Ponto(){
        this(0.0, 0.0, 0.0, "");
    }
    
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getElevacao() {
        return elevacao;
    }

    public void setElevacao(double elevacao) {
        this.elevacao = elevacao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
