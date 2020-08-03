package arboltest;

import java.util.LinkedList; 
import java.util.Queue; 
public class MainTest { 	
    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
    static class Node { 
        int key, valor; 
        Node left, right; 
          
        // constructor 
        Node(int key, int valor){ 
            this.key = key;
            this.valor=valor;
            left = null; 
            right = null; 
        } 
    } 
    static Node root; 
    static Node temp = root; 
      
  //impresion 2d
	  static private void print2DUtil(Node root, int space)  
	  {  
	      // caso base 
	      if (root == null)  
	          return;  
	    
	      // Distancia entre niveles
	      space += 8;  
	    
	      // nodo derecho primero
	      print2DUtil(root.right, space);  
	    
	      // imprime el nodo actual 
	      for (int i = 8; i < space; i++)  
	          System.out.print(" ");  
	      System.out.print(root.key+"-"+root.valor + "\n");  
	    
	      // luego izquierdo
	      print2DUtil(root.left, space);  
	  }  

	  static public void print2D(Node root)  
	  {  
	      // pase inicial 0 
	      print2DUtil(root, 0);  
	  }  
       
    /*function to insert element in binary tree */
    static void insert(Node temp, int key) 
    { 
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(temp); 
       
        // Do level order traversal until we find 
        // an empty place.  
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.left == null) { 
                temp.left = new Node(key,0); 
                break; 
            } else
                q.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(key,0); 
                break; 
            } else
                q.add(temp.right); 
        } 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
    	int i=1;
    	
        root = new Node(0,2); 
        while (i!=31){
        insert(root, i); 
        i++;}
        
        print2D(root);        
       
    } 
} 
// This code is contributed by Sumit Ghosh 