package Principiante.Exercises;

public class Exercises {

    public static double suma(int age, double estatura) {
        return age + estatura;
    }

    public static void main(String[] args) {
        String localidad = "Los Teques";

        System.out.println(localidad);

        localidad = "Caracas";

        System.out.println(localidad);

        System.out.println(localidad.getClass());
        int age = 22;
        System.out.println(age);

        String name = "Alexander";
        double altura = 1.87;
        final String email = "Alexander27aazocar@gmail.com";
        boolean isBoolean = true;
        char letra = 'A';

        System.out.println(suma(age, altura));

        }

    }

