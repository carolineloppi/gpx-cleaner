package modelo;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;


public class Segmento {
     /*Para este caso não seria útil usar o Lombok. 
       Descobrir se é possível alterar tipo de retorno*/
    private List<Ponto> pontos;
    
    public Segmento(){
        this.pontos = new ArrayList<Ponto>();
    }
    
    public int contaPontos(){
        return pontos.size();
    }
    
    public Ponto pegaPontoIndice(int indice){
         return pontos.get(indice);
     }
     
    public void adicionaPonto(double latitude, double longitude, double elevacao, String tempo){
        pontos.add(new Ponto(latitude, longitude, elevacao, tempo));
    }
    
    public void adicionaPonto(Ponto ponto){
        pontos.add(ponto);
    }
    
    public void removePonto(int indice){
        pontos.remove(indice);
    }
    
//    public Iterable<Ponto> getPontos(){
//        return pontos;
//    }   

}
