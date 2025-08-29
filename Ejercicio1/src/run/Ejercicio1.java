package run;

import models.Person;

public class Ejercicio1
{
    public static void main(String[] args)
    {
        Person person = new Person();

        //Asignar valores a los atributos
        person.name = "Allan";
        person.age = 18;

        //Mostrar datos
        System.out.println(person.mostrarDatos());
    }
}
