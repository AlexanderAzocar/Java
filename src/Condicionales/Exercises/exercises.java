package Condicionales.Exercises;

public class exercises {

    public static void edadVotar(int age){
        if(age > 18){
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("el usuario es menor de edad y no puede votar");
        }
    }

    public static void verificarNumero(int numero1, int numero2){
        if(numero1 > numero2) {
            System.out.println("El numero 1 es mayor al numero 2");
        }   else if (numero1 == numero2) {
            System.out.println("los numeros son iguales");
        } else {
            System.out.println("el numero 2 es mayor al numero 1");
        }
    }

    public static void imparPar(int numero) {
        if(numero / 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static void rangoNumeros(int numero){
        if(numero <= 100 && numero > 0) {
            System.out.println("El numero se encuentra en el rango de 1 a 100");
        } else {
            System.out.println("El numero no se encuentra en el rango");
        }
    }

    public static void notas(int nota) {
        if(nota > 90) {
            System.out.println("Ah aprobado su nota es sobresaliente");
        }  else if (nota > 75 ) {
            System.out.println("Ah aprobado su nota es de " + nota);
        } else {
            System.out.println("Su nota es de suspenso usted no ha aprobado " + nota);
        }
    }

    public static void vocalConsonante(char letra) {
        if(letra == 'a' | letra == 'e' | letra == 'i' | letra == 'o' || letra == 'u'){
           System.out.println("la letra es una vocal"
           );
        } else {
            System.out.println("la letra es Consonante");
        }
    }

    public static void main(String[] args) {

        var age = 22;
        edadVotar(age);

        var numero1 = 27;
        var numero2 = 12;

        verificarNumero(numero1, numero2);

        imparPar(numero2);

        rangoNumeros(-1);

        var day = 2;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("vieres");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
        }

        vocalConsonante('a');
    }
}
