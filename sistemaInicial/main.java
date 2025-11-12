// (actividad4)
package actividad3;
public class main {
    public static void main(String[] args) {
        // Crear tres objetos member
        member member1 = new member("Carlos Pérez", 23456776, "Premium");
        member member2 = new member("Lucía Gómez", 76565322, "Básica");
        member member3 = new member("Valentina Ramírez", 225642122, "Intermedia");
        member member4 = new member("Angelica Santos", 52538162, "Eterna");
        member member5 = new member("Patricia Méndez", 1019003413, "Temporal");
        
        // Mostrar la información de cada miembro
        member1.showInfo();
        member2.showInfo();
        member3.showInfo();
        member4.showInfo();
        member5.showInfo();
    }

}
