package arboltest;
import java.util.LinkedList; 
import java.util.Queue; 

public class ArbolTest {
	// raiz del arbol o primer NodoTest
    NodoTest raiz; 
  
    // Constructores 
    ArbolTest(int x,int valor){ 
        raiz = new NodoTest(x,valor);
        } 
  
    ArbolTest(){ 
        raiz = null;
        } 
    
    public boolean esVacio(){
    	return (raiz==null); //true es vacio 
    }
    
    //insertar NodoTest
    
    private NodoTest insertarNodo (NodoTest actual, int valor){
    	if (actual==null){
    		return new NodoTest(valor,2);
    	}
    	
    	if (valor<actual.x){
    		actual.hijoIzq=insertarNodo(actual.hijoIzq,valor);
    	}
    	else if (valor>actual.x){
    		actual.hijoDer=insertarNodo(actual.hijoDer,valor);
    	}
    	return actual;
    }
    public void insertar(int valor){
    	raiz=insertarNodo(raiz,valor);
    }
    
    //buscar elemento
    
    private boolean contieneNodo(NodoTest actual, int valor){
    	if (actual==null){
    		return false;
    	}
    	if (valor==actual.x)
    		return true;
    	return valor < actual.x //condicion
    		? contieneNodo(actual.hijoIzq,valor) //true
    		: contieneNodo (actual.hijoDer,valor); //false
    }
    
    public boolean contiene (int valor){
    	return contieneNodo(raiz,valor);
    }
    
    //eliminar NodoTest
    private int valorMenor(NodoTest raiz){
    	return raiz.hijoIzq==null
    			? raiz.x :valorMenor(raiz.hijoIzq);
    }
    
    private NodoTest eliminarNodo (NodoTest actual, int valor){
    	
    	if (actual==null)//vacio
    		return null;
    	
    	if (valor==actual.x){//NodoTest encontrado
    		
    		//NodoTest sin hijos
    		if ((actual.hijoDer==null)&&(actual.hijoIzq==null))
    		return null;
    		
    		//NodoTest con un hijo: reemplazar con el hijo
    		if (actual.hijoDer==null)
    			return actual.hijoIzq;
    		if (actual.hijoIzq==null)
    			return actual.hijoDer;
    		
    		//NodoTest con dos hijos
    		//encontrar NodoTest que reemplace al eliminado
    		int menor = valorMenor(actual.hijoDer);
    		actual.x = menor;
    		actual.hijoDer=eliminarNodo(actual.hijoDer,menor);
    		return actual;    		
    	}
    	
    	if (valor< actual.x){ //valor menor al NodoTest
    		actual.hijoIzq=eliminarNodo(actual.hijoIzq,valor);
    	return actual;
    	}
    	//valor mayor al NodoTest
    	actual.hijoDer=eliminarNodo(actual.hijoDer,valor);
    	return actual;
    }

    public void eliminar (int valor){
    	raiz=eliminarNodo(raiz,valor);
    }
    
    
    public NodoTest insert(NodoTest temp, int key) 
    { 
        Queue<NodoTest> q = new LinkedList<NodoTest>(); 
        q.add(temp); 
       
        // Do level order traversal until we find 
        // an empty place.  
        int i=1;
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.hijoIzq == null) { 
                temp.hijoIzq = new NodoTest(key,i); 
                return temp.hijoIzq;
            } else
                q.add(temp.hijoIzq); 
       
            if (temp.hijoDer == null) { 
                temp.hijoDer = new NodoTest(key,i); 
                return temp.hijoDer;
            } else
                q.add(temp.hijoDer); 
            i++;
        } 
        return null;
    } 
    
    public void insertTemp(int key){
    	raiz=insert(raiz, key);
    }
    
    
}
