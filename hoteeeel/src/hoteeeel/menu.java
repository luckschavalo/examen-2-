package hoteeeel;

import javax.swing.JOptionPane;
// el menu del hotel 
public class menu {
   private byte opc;
   public void mostrarMenu(){
        habitaciones h = new habitaciones();
      while(opc!=4){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
             "MENÚ PRINCIPAL\n\n"
             + "1.Agregar producto\n"
             + "2.Completar inventario\n"
             + "3.Mostrar productos\n"
             + "4.Salir\n\n"
             + "Digite su opción:"));
         switch(opc){
             case 1 -> {
                h.Precargar();
             }
             case 2 -> {
                h.Modificar();
             }
             case 3 -> {
                h.Visualizar();
             }
             case 4 -> {
                System.exit(0);
             }
             default -> {
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
 
    
    
