package Views;

import java.util.Scanner;

import Models.Person;

public class View {
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }
    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Ingresar Personas");

        System.out.println("100. Salir");
        System.out.print("Ingrese una opcion: ");
        return scanner.nextInt();
    }

    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName(){
        System.out.println("Ingrese e nombre: ");
        return scanner.next();
    }

    public int inputAge(){
        return inputInt("Ingrese la edad: ");
    }
   
}
