package examen1;

public class Poligono{
    private Vertice[] vertices;

    public Poligono() {
        vertices= new Vertice[0];
    }
    
    public int númeroVértices(){
        return vertices.length;
    }
    
    public Vertice vértice(int i) throws Exception{
        if(i<0 || i>vertices.length) throw new Exception();
        return vertices[i];
    }
    
    public void insertaVértice(int pos, Vertice v) throws Exception{
        if(pos<0 || pos>vertices.length+1 || v==null) throw new Exception();
        Vertice[] aux= new Vertice[vertices.length+1];
        System.arraycopy(vertices, 0, aux, 0, pos);
        aux[pos]=new Vertice(v.getX(), v.getY());
        System.arraycopy(vertices, pos, aux, pos + 1, vertices.length - pos);
        vertices=aux;
    }
    
    public void modificaVértice(int pos, Vertice v) throws Exception{
        if(pos<0 || pos>vertices.length) throw new Exception();
        if(v==null){
            Vertice[]aux=new Vertice[vertices.length-1];
            System.arraycopy(vertices, 0, aux, 0, pos);
            System.arraycopy(vertices, pos+1, aux, pos, vertices.length-(pos+1));
//            for(int i=pos+1;i<vertices.length;i++){
//                aux[i-1]=vertices[i];
//            }
        }else{
            vertices[pos]=new Vertice(v.getX(), v.getY());
        }        
    }
    
    public int perímetro(){
        int perimetro=0;
        for(int i=0;i<vertices.length-1;i++){
            perimetro+=vertices[i].distancia(vertices[i+1]);
        }
        return perimetro;//+=vertices[vertices.length-1].distancia(vertices[0]);
    }
    
    public void desplaza(int dx, int dy) throws Exception{
        for(int i=0;i<vertices.length;i++){
            modificaVértice(i, new Vertice(vertices[i].getX()+dx, vertices[i].getY()+dy));
        }
    }    
    
}