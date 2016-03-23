package modelo;
import lombok.Getter;
import lombok.Setter;

public class  Ponto {
    private @Getter @Setter double latitude;
    private @Getter @Setter double longitude;
    private @Getter @Setter double elevacao;
    private @Getter @Setter String tempo;

    public Ponto(double latitude, double longitude, double elevacao, String tempo){
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevacao = elevacao;
        this.tempo = tempo;
    }
    
    public Ponto(){
        this(0.0, 0.0, 0.0, "");
    }
}
