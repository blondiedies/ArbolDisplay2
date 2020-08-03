package arboltest;

public class NodoTest {
	public int x;
	public int valor;
	public NodoTest hijoDer;
	public NodoTest hijoIzq;
	
	//construct
	
	public NodoTest(int x, int valor){
		this.x=x;
		this.valor=valor;
		hijoIzq=hijoDer=null;
		}
	
	//getsetters
	
	public int getX() {
		return x;
	}
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setX(int x) {
		this.x = x;
	}
	public NodoTest getHijoDer() {
		return hijoDer;
	}
	public void setHijoDer(NodoTest hijoDer) {
		this.hijoDer = hijoDer;
	}
	public NodoTest getHijoIzq() {
		return hijoIzq;
	}
	public void setHijoIzq(NodoTest hijoIzq) {
		this.hijoIzq = hijoIzq;
	}
	//
	//pre y post orden
	  private void procesarInfo(NodoTest a) {
	  	   System.out.println (a.getX());
	  	}

	  
	  public void preOrden(NodoTest a) {
	  	if (a != null) {
	  	   procesarInfo(a);
	  	   
	  	   preOrden(a.getHijoIzq());
	  	   preOrden(a.getHijoDer());
	  	   }		
	  	}

	  
	  public void postOrden(NodoTest a){
	  	if (a!=null){
	  		preOrden(a.getHijoIzq());
	  		preOrden(a.getHijoDer());
	  		procesarInfo(a);
	  	}
	  }
	  
	  /****/
	  //impresion 2d
	  private void print2DUtil(NodoTest root, int space)  
	  {  
	      // caso base 
	      if (root == null)  
	          return;  
	    
	      // Distancia entre niveles
	      space += 8;  
	    
	      // nodo derecho primero
	      print2DUtil(root.hijoDer, space);  
	    
	      // imprime el nodo actual 
	      for (int i = 8; i < space; i++)  
	          System.out.print(" ");  
	      System.out.print(root.x + "\n");  
	    
	      // luego izquierdo
	      print2DUtil(root.hijoIzq, space);  
	  }  

	  public void print2D(NodoTest root)  
	  {  
	      // pase inicial 0 
	      print2DUtil(root, 0);  
	  }  
	

}
