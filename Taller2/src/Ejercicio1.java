import java.util.Scanner;
public class Ejercicio1 {
    String nombre;
    String posicion;
    int edad;
    int camiseta;

    //metodo constructor
    public Ejercicio1(String nombre, String posicion, int edad, int camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.camiseta = camiseta;
    }
    //imprimimos
    void mostrar(){
        System.out.println(nombre+ ", juega en la posicion de "+posicion+", tiene "+edad+" años de edad y juega con el numero de camisa "+camiseta);
    }
    //los objetos
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("========== Registro de jugador 3 ===========: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Posicion: ");
        String posicion = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Numero de camiseta: ");
        int camiseta = sc.nextInt();
        //creamos el 3 jugador
        Ejercicio1 objeto1 = new Ejercicio1("Lionel Messi", "delantero", 38, 10);
        Ejercicio1 objeto2 = new Ejercicio1("Enner Valencia","delantero", 40,7);
        objeto1.mostrar();
        objeto2.mostrar();
        Ejercicio1 objeto3 = new Ejercicio1(nombre, posicion, edad, camiseta);
        objeto3.mostrar();
    }
}

