package Functions.Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {

    //function saludo
    public static void saludo(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    //funcion con nombre
    public static void saludoPersona(String name) {
        System.out.println("Hola " + name);
    }

    //function resta
    public static int restaNumeros(int numero, int numero2){
        return numero - numero2;
    }

    //cuadradod e un numero
    public static int cuadradoNumero(int numero){
        return numero * numero;
    }

    //funcion numero mayor
    public static void numeroMayor(int numero1, int numero2) {
        if(numero1 > numero2) {
            System.out.println("El numero 1 " + numero1 + " es mayor al numero2 " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El numero 2 " + numero2 + " es mayor al numero 1 " + numero1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    //verificar mayor o menor de edad
    public static boolean checkAge(int age){
        return age > 18;
    }

    //check Longitud de Strings
    public static int checkLength(String cadena){
        return cadena.length();
    }

    //calcular media
    public static double calcularMedia(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo ni vacío");
        }
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }


    //Factorial de un numero
    public static int factorial(int numero){
        var resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    //ArrayList
    public static void recorrerArray(ArrayList<Integer> numeros) {
        if (numeros == null || numeros.toArray().length == 0) {
            System.err.println("El array de ArrayList no puede ser vacío o nulo");
            return; // detenemos la ejecución
        }
        for (int i = 0; i < numeros.toArray().length; i++) {
            System.out.println("Elemento en índice " + i + ": " + numeros.get(i));
        }
    }


    public static void main(String[] args) {

        //llamada a la funcion
        saludo();

        //llamada a funcion con nombre
        saludoPersona("Alexander");

        checkAge(27);
        System.out.println(cuadradoNumero(54));

        System.out.println(restaNumeros(11, 27));

        System.out.println(factorial(5));

        var array = new int[]{24, 23, 324, 4234, 4324523, 53245352, 324};

        numeroMayor(213,434);

        var arrayList = new ArrayList<Integer>();
        arrayList.add(0,2133);
        arrayList.add(1,12);
        arrayList.add(2,3434);


        recorrerArray(arrayList);


        var calculo = calcularMedia(array);

        System.out.println(calculo);
    }



}
