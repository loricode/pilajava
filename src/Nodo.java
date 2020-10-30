
public class Nodo {
  //atributos
  String nombre;
  int edad;
  Nodo siguiente;
  
 //constructor 
public Nodo(){
   nombre="";
   edad=0;
   siguiente = null; 
}  
  //metodos get y set
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public Nodo getSiguiente() {
      return siguiente;
   }

   public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
   }


}
