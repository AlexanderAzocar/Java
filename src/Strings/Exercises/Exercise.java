package Strings.Exercises;

public class Exercise {

    public static void main(String[] args){
        String cadena1 = "hola";
        String cadena2 = "alexander";
        System.out.println(cadena1.concat(cadena2));

        System.out.println(cadena1.length());

        System.out.println(cadena1.charAt(0));
        System.out.println(cadena2.charAt(cadena2.length() - 1));

        System.out.println(cadena1.toLowerCase());
        System.out.println(cadena1.toUpperCase());
        var cadena3 = "hola";
        System.out.println(cadena1.contains(cadena3));

        var gae = 22;
        System.out.println(cadena3.replace(" ", "-"));

        System.out.println(cadena1.equals("hola"));

        System.out.println(cadena1.substring(3));


        System.out.println(cadena1.length() == cadena3.length());

        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d.", cadena2, age));
    }
}
