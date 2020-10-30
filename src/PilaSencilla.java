
import javax.swing.JOptionPane;

/**
 *
 * @author angel campillo
 */
public class PilaSencilla {

   
   public static void main(String[] args) {
     Pila mipila = new Pila();
     int edad ;
     String nombre;
     byte opc;
     
     do{
        opc = Byte.parseByte(JOptionPane.showInputDialog(
                  "|| Menu Principal || \n"
                + "1. Apilar\n"
                + "2. Desapilar\n"
                + "3. Mostrar Pila\n"
                + "4. Mostrar mayor de Edad\n"
                + "5. Buscar por Nombre\n"
                + "6. Salir\n"
                + "Elige una Opcion :)\n"));
                
       switch(opc){
          case 1:
              nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
              edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad"));
              mipila.apilar(nombre, edad);
             break;
              
          case 2:
              mipila.desapilar();
              break;
              
          case 3:
              mipila.mostrarPila();
              break;
              
          case 4:
              mipila.mayorDeEdad();
              break;
           
          case 5: 
              nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
              mipila.buscarPorNombre(nombre);
              break;
          case 6:
              opc=6;
              JOptionPane.showMessageDialog(null, "good bye");
              break;
        }}while(opc!=6);
     System.exit(0);
     }
}
