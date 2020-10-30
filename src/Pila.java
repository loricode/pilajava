
import javax.swing.JOptionPane;


public class Pila {
   
   private Nodo inicio;
   int tamanio;
   
   public Pila(){
   inicio = null;
   tamanio = 0;
  
}
   
 public boolean esVacia(){
    return inicio == null;
 }

  public int getTamanio(){
    return tamanio;
 }  
   
  //me permite agregar un objeto a la pila
   public void apilar(String nombre, int edad){
     Nodo nuevo = new Nodo();
     nuevo.setNombre(nombre);
     nuevo.setEdad(edad);
       
     if (esVacia()) {
            inicio = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        
        tamanio++;
    }  
  
   public void desapilar(){
        
       if (!esVacia()) { //verifica que la pila no este vacia
             inicio = inicio.getSiguiente();
             tamanio--;
         }
   }  
   //me permite mostrar todos los datos de la pila
 public void mostrarPila(){
     Nodo aux = inicio;
     String cadena="pila\n";  
      
     while(aux != null){
       cadena+="{"+"\"nombre\": "+aux.getNombre()+" \"edad:\" "+aux.getEdad()+" }\n"; 
       aux = aux.getSiguiente();
     }
      
     JOptionPane.showMessageDialog(null, cadena);
     
    }  
 
 
  public void mayorDeEdad(){
    Nodo aux = inicio;
    String cadena="pila\n";  
      
    while(aux != null){
       if(aux.getEdad()>=18){
         cadena+="{"+"\"nombre\": "+aux.getNombre()+" \"edad:\" "+aux.getEdad()+" }\n"; 
       }
        
         aux = aux.getSiguiente();
        }
     
    JOptionPane.showMessageDialog(null, cadena);
     
  } 
 
  public void buscarPorNombre(String nombre){
    Nodo aux = inicio;
    String cadena="pila\n";  
      
    while(aux != null){
      if(aux.getNombre().equals(nombre)){
        cadena+="{"+"\"nombre\": "+aux.getNombre()+" \"edad:\" "+aux.getEdad()+" }\n"; 
       }
       
        aux = aux.getSiguiente();
        }
     JOptionPane.showMessageDialog(null, cadena);
     
    }
  
}
