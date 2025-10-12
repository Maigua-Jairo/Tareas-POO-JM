import java.util.Scanner;
public class Ejercicio2 {
    String nombre;
    String cargo;
    Double salario;
    String ingreso ;
    //Metodo constructor
    public Ejercicio2(String nombre, String cargo, Double salario, String ingreso){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.ingreso = ingreso;
    }
    //mostrar
    void mostrar(){
        System.out.println(nombre+ " con el cargo de "+cargo+" tiene un salario de $"+salario+ " y su fecha de ingreso fue el "+ingreso);
    }
    //objetos
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado 1: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el cargo del empleado 1: ");
        String cargo = sc.nextLine();
        System.out.println("Ingrese el salario del empleado 1: ");
        Double salario = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la fecha de ingreso del empleado 1: ");
        String ingreso = sc.nextLine();
        Ejercicio2 emp1 = new Ejercicio2 (nombre, cargo, salario, ingreso);

        System.out.println("Ingrese el nombre del empleado 2: ");
        String nombre2 = sc.nextLine();

        System.out.println("Ingrese el cargo del empleado 2: ");
        String cargo2 = sc.nextLine();
        System.out.println("Ingrese el salario del empleado 2: ");
        Double salario2 = sc.nextDouble();
        System.out.println("Ingrese la fecha de ingreso del empleado 2: ");
        String ingreso2 = sc.nextLine();
        sc.nextLine();
        Ejercicio2 emp2 = new Ejercicio2(nombre2, cargo2, salario2, ingreso2);

        System.out.println("Ingrese el nombre del empleado 3: ");
        String nombre3 = sc.nextLine();

        System.out.println("Ingrese el cargo del empleado 3: ");
        String cargo3 = sc.nextLine();
        System.out.println("Ingrese el salario del empleado 3: ");
        Double salario3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la fecha de ingreso del empleado 3: ");
        String ingreso3 = sc.nextLine();
        Ejercicio2 emp3 = new Ejercicio2(nombre3, cargo3, salario3, ingreso3);
        emp1.mostrar();
        emp2.mostrar();
        emp3.mostrar();
    }
}