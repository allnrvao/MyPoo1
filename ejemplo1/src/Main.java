import models.Student;

import  java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Universidad Americana");
        int edad;
        edad = 18;
        System.out.println("Mi edad es " + edad);

        float dato;
        dato = 34.33f;
        System.out.println("El dato es +" + dato);

        double PI = 3.14159;
        System.out.println("El valor de PI es =" + PI);

        float PromedioPoo1 = 89.99f;

        System.out.println("Tu promedio de Poo es" + PromedioPoo1);


        Student allan = new Student();
        allan.setNombre("Allan");
        allan.setApellidos("Acuna");
        allan.setEdad(edad);

        System.out.println("El estudiante es " + allan.getNombre() + " " );

    }
}
