package hoteeeel;

import javax.swing.JOptionPane;

public class habitaciones {
    
 private final habitacion habitaciones[] = new habitacion[11];
 //los datos ya cargados
 public void preCarga(){
        habitaciones[0] = new  habitacion("100","simple","ocupada",40);
        habitaciones[1] = new  habitacion("101", "doble", "sucia", 20);
        habitaciones[2] = new  habitacion(" 102", "simple", "libre", 30);
        habitaciones[3] = new  habitacion("103", "doble", "ocupada", 50);
        habitaciones[4] = new  habitacion(" 104", "simple", "sucia", 30);
        habitaciones[5] = new  habitacion("105", "doble", "libre", 150);
        habitaciones[6] = new  habitacion("106", "simple", "ocupada ", 40);
        habitaciones[7] = new  habitacion("107", "doble", "sucia", 60);
        habitaciones[8] = new  habitacion("108", "simple", "libre", 30);
        habitaciones[9] = new  habitacion("109", "doble", "ocupada", 10);
        habitaciones[10] = new  habitacion("110", "simple", "libre", 70);
}
 
 public void mostrar(){
     //para poder mostrar 
     StringBuilder p = new StringBuilder();
        p.append("Piso 3:\n");
        agregarHabitacionesPorPiso(p, 8, 10); 

        p.append("Piso 2:\n");
        agregarHabitacionesPorPiso(p, 5, 7);  

        p.append("Piso 1:\n");
        agregarHabitacionesPorPiso(p, 0, 4);
 }
 
 public void agregarHabitaciones(StringbBuilder p, int inicio, int fin){
     for (int i = inicio; i <= fin; i++){
         p.append(habitaciones[i].getClass()).append(" - ");
         p.append(habitaciones[i].getClass()).append(" - ");
         p.append(habitaciones[i].getClass()).append(" - $");
         p.append(habitaciones[i].getClass()).append("\n");   
     }//para agregar datos 
 }
 
 public void modificarHabitaciones(){
    String numeroHabitacion = JOptionPane.showInputDialog(null, "Número de la habitación:");
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion.getNumero().equals(numeroHabitacion)) {
                habitacion.setTipo(JOptionPane.showInputDialog(null, "Tipo de habitación:"));
                habitacion.setEstado(JOptionPane.showInputDialog(null, "Estado de la habitación:"));
                habitacion.setPrecioPorNoche(Integer.parseInt(JOptionPane.showInputDialog(null, "Precio por noche:")));
                break;
            }
        }//para modificar 
    }
//falto el resumen por falto de tiempo
         


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void Visualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void Precargar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }         

    private void agregarHabitacionesPorPiso(StringBuilder s, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class habitacion {

        public habitacion() {
        }

        private habitacion(String string, String simple, String ocupada, int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
