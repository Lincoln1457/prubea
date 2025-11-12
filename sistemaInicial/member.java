package actividad3;
public class member {
    // Atributos
    String nombre;
    int identificacion;
    String tipoMembresia;
    
    // Constructor
    public member(String nombre, int identificacion, String tipoMembresia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoMembresia = tipoMembresia;
    }
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("Miembro: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Membresía: " + tipoMembresia);
    }
}