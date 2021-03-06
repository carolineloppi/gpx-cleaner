package modelo;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Trilha {
    private @Getter @Setter String nome;
    private List<Segmento> segmentos;
    
    public Trilha(String nome){
        this.nome = nome;
        this.segmentos = new ArrayList<Segmento>();
    }
    
    public Trilha(){
        this("");
    }
    
    public int contaSegmentos(){
        return segmentos.size();
    }
    
    public Segmento pegaSegmentoIndice(int indice){
         return segmentos.get(indice);
    }
    
    //Ao dar return segmento, evita o uso do get para recuperar o segmento
    public Segmento adicionaSegmento(){
        Segmento segmento = new Segmento();
        segmentos.add(segmento);
        return segmento;
    }
    
    public void adicionaSegmento(Segmento segmento){
        segmentos.add(segmento);
    }
    
    public void removeSegmento(int indice){
        segmentos.remove(indice);
    }
    
    public Iterable<Segmento> getSegmentos(){
        return segmentos;
    }   

}
