package examen1;
/**
 * La clase Vertice permite representar puntos en un plano 
 * mediante sus coordenadas cartesianas
 */
public class Vertice {
	private int x, y;

	/** 
	 * Inicializa ambas coordenadas
	 * con los valores pasados por parámetro
	 */
	public Vertice(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Devuelve el valor de la coordenada x del vértice actual
	 * @return el valor de la coordenada x
	 */
	public int getX(){
		return x;
	}

	/**
	 * Devuelve el valor de la coordenada y del vértice actual
	 * @return el valor de la coordenada y
	 */
	public int getY(){
		return y;
	}

	/**
	 * Comprueba si dos objetos de la clase Vertice son iguales
	 * @param v es un objeto a comparar
	 * @return true si los dos objetos de la clase Vertice son iguales
	 */
	public boolean equals(Object v){
		if(v instanceof Vertice){
		   Vertice otro= (Vertice) v;
		   return (x==otro.x) && (y==otro.y);
		}
		return false;
	}
	
	/**
	 * Devuelve la distancia entre dos vértices
	 * @param v vértice con el que comparar
	 * @return distancia entre el vértice actual y el pasado
	 */
	public double distancia(Vertice v){
		int xd=x-v.x;
		int yd=y-v.y;
		return Math.sqrt((xd*xd)+(yd*yd));
	}
	
	/**
	 * Devuelve la ristra que representa un vértice
	 * @return ristar con formato (x,y)
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
}
