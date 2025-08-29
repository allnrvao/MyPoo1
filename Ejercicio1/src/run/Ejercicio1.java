package run;

public class Ejercicio1
{
    public static void main(String[] args)
    {
        Person person = new Person();

        //Asignar valores a los atributos
        person.nombre = "Allan";
        person.edad = 18;

        //Mostrar datos
        System.out.println(person.mostrarDatos());
    }
}
