/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsl;

/**
 *
 * @author lopez
 */
public class LSL<T> {
    private T dato;
    private LSL<T> head;
    
    public LSL() {
    }

    public LSL(T valor) {
        this.dato = valor;
    }

    public LSL(T dato, LSL<T> siguiente) {
        this.dato = dato;
        this.head = siguiente;
    }

    public LSL<T> getSiguiente() {
        return head;
    }

    public void setSiguiente(LSL<T> siguiente) {
        this.head = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
     public boolean Vacio(){
        return this.head==null;}
     
    public int getTamanio(){
        int cont = 0;
        LSL<T> aux = head;
        while(aux != null){
            aux=aux.getSiguiente();
            cont++;
        }
        return cont;}
    
    public void AgrInicio(T valor){
        if(head==null){
            head=new LSL<>(valor); 
        }else{
            LSL<T> nuevo = new LSL(valor);
            nuevo.setSiguiente(head);
            head=nuevo;
        }
    }
    
    public void AgrFinal(T valor){
        if(this.head == null){
            head=new LSL<>(valor);  
        }else{
            LSL<T> nuevo = new LSL(valor);
            LSL<T> aux = head;
            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
           aux.setSiguiente(nuevo);  
        }
    }
    
    public void AgregarDespuesDe(T dato, T valor){
        if(head==null){
            head=new LSL<>(valor); 
        } else{ LSL<T> aux = head;
           while(aux.getSiguiente()!=null && aux.getDato()!= dato){
               aux=aux.getSiguiente();
           }
           LSL<T> nuevo = new LSL<>(valor, aux.getSiguiente());
           aux.setSiguiente(nuevo);
        }
    }
    
    public int Buscar(T dato){
        int cont = 0;
        LSL<T> aux = head;
        
        while(aux != null){
            if(aux.getDato() == dato){
            break;
            }else{
                aux=aux.getSiguiente();
                cont++;
            } 
        }
        
        return cont+1;}
    
    public void Actualiza(T a_busca, T valor){
        LSL<T> aux = head;
        while(aux != null && aux.getDato()!= a_busca){
            aux=aux.getSiguiente();
        } aux.setDato(valor); }
    
    public void EliPrimero(){head=head.getSiguiente();}
         
    public void EliFinal(){
        LSL<T> nuevo = null;
        LSL<T> aux = head;
        
        while(aux.getSiguiente()!=null){
            nuevo=aux;
            aux=aux.getSiguiente();
            
        }
       nuevo.setSiguiente(null);}
    
    public void Eliminar(int posi){
         int index = 1;
         LSL<T> nuevo = null;
         LSL<T> aux = head;
         while(aux.getSiguiente()!=null && index < posi){
             nuevo = aux;
             aux=aux.getSiguiente();
             index++;
         }
         nuevo.setSiguiente(aux.getSiguiente());}
    
        public void Transversal(){
        
        LSL<T> aux = head;
        while (aux != null) {
            
            System.out.print("|"+aux.dato+"| -->");
            
            aux = aux.getSiguiente();
        }
    }
    
    
    
    
    

    @Override
    public String toString() {
        
        return "/"+dato+"/-->"; 
    }
   
}