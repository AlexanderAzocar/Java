package Bucles.Exercises;

import java.util.*;

public class Exercises {

    public static void imprimirNumeros(){
        var numero = 10 ;
        var i = 0;
        while (numero > i){
            i += 1;
            System.out.println(i);
        }
    }

    public static Integer sumaTotal( Integer[] numbers) {
        var total = 0;
        for (Integer n : numbers) {
            total = total + n;
        } return total;
    }

    /*
    public static void doWhile(ArrayList<Integer> numeros){
        var i = 0;
        doWhile( i > );
    }
    */

    public static void mostrarValores(int[] numbers){
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public static void multipleFive(int number){
        for (var five = 5; number >= five; five+=5) {
            System.out.println(five);
        }
    }

    public static void recorrerHashSet(HashSet<Integer> numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public static void recorrerHashMap(HashMap<String, Integer> diccionario) {
        for (HashMap.Entry<String, Integer> entrada : diccionario.entrySet()) {
            String clave = entrada.getKey();
            Integer valor = entrada.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
    }

    public static void numerosReves(int number){
        for (int i = 0; number > i; number--){
            System.out.println(number);
        }
    }

    public static void  desendiente(int number) {
        for (int i = 0; number >= i; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i);
        }
    }

    public static void negative(int[] numbers) {
        for (int n : numbers) {
            if (n < 0) {
                break;
            } System.out.print(n);
        }
    }

    public static int factorial(Integer numero){
        var resultado = 1;
        if (numero == 1 || numero == 0) {
            System.out.println("Por favor imgrese un numero valido");
        }
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {

        imprimirNumeros();

        multipleFive(50);

        Integer[] numbers = {44,324,552,542,424,665,67635,765};

        int[] numeros = {44,324,552,542,424,665,67635,765, 33};


        System.out.println(sumaTotal(numbers));
        mostrarValores(numeros);

        var hashMap = new HashMap<String,Integer>();

        hashMap.put("yone", 27);
        hashMap.put("tiago", 12);
        hashMap.put("lopez", 55);
        hashMap.put("maryuri maria", 55);

        recorrerHashMap(hashMap);

        var hashSet = new HashSet<Integer>();

        hashSet.add(23);
        hashSet.add(15);
        hashSet.add(33);
        hashSet.add(41);
        hashSet.add(22);
        hashSet.add(54);
        hashSet.add(55);

        recorrerHashSet(hashSet);

        numerosReves(10);

        desendiente(20);

        int[] listaNumeros = {44,55,54,22,43,53,-2,45,767,345};

        negative(listaNumeros);

        System.out.println("Por favor ingresa un numero para calcular el factorial");
        var entrada = new Scanner(System.in);
        var numero = entrada.nextInt();
        System.out.println(factorial(numero));
        entrada.close();



    }
}
