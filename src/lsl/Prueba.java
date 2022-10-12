
package lsl;

import javax.swing.JOptionPane;


/**
 *
 * @author lopez
 */
public class Prueba {
    
public static void main(String[] args) { 
     int a, c;
     LSL<Integer> head = new LSL();
     
     c = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
     head.AgrInicio(c);
     for(int i=0; i<5; i++){
         a = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
         head.AgrInicio(a);
         a=0;
     }
     System.out.println("La lista esta vacia: " + head.Vacio());
      System.out.println("Los elementos de la lista son: ");
       head.Transversal();
     
       a=0; 
 
       
      do{
       System.out.println();
       System.out.println("Bienvenido al Menu: ");
       System.out.println("0. Salir");
       System.out.println("1. Dame el tamaño de la lista ");
       System.out.println("2. Agregar Despues");
       System.out.println("3. Agregar un Numero a la Lista");
       System.out.println("4. Buscar en la lista");
       System.out.println("5. Eliminar el Primer numero en la lista");
       System.out.println("6. Eliminar el Ultimo numero en la lista");
       System.out.println("7. Eliminar en la pocision n");
       System.out.println();
       a = Integer.parseInt(JOptionPane.showInputDialog("Tu opcion"));
       switch(a){
           case 1:  System.out.println("El tamaño de la lista es de: "+head.getTamanio()); System.out.println(); break;
           
           case 2: int b; System.out.println("Agregar despues: ");
           b = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero para agregar a la lista"));
           head.AgregarDespuesDe(c, b); System.out.println("La nueva lista es: "); System.out.println(); head.Transversal(); break;
          
           case 3: int t; 
           t = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero para agregar a la lista"));
               head.Actualiza(c, t);
              System.out.println("La nueva lista es: "); System.out.println(); head.Transversal(); break;
           
           case 4: int x; x = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero para agregar buscar en la lista"));
               System.out.println("¿En que posicion se encuentra el "+x+"? En la posicion: "+head.Buscar(x)); break;
           
           case 5:  System.out.println("Eliminar el Primero: ");
               head.EliPrimero(); System.out.println("La nueva lista es: "); System.out.println(); head.Transversal(); break;
           
           case 6: System.out.println("Eliminar el final: "); head.EliFinal(); 
           head.EliFinal();  System.out.println("La nueva lista es: "); System.out.println(); head.Transversal(); break;
           
              
           case 7: System.out.println("Eliminar la posicion n: ");
           int posicion; 
           posicion = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero para agregar a la lista"));
           head.Eliminar(posicion);  System.out.println("La nueva lista es: "); System.out.println(); head.Transversal(); break;
           
           default: break;
           
       } }while(a==0);
    }
}
