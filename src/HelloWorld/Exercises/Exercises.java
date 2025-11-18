package HelloWorld.Exercises;
    //clase principal
public class Exercises {
    //Atrinbutos de la clase con un modificador de acceso privado
     static int age = 22;
     static String color = "Verde";
     static String city = "Los Teques";
        //metodo estatico de ejecucion principal
    public static void main(String[] args) {
        //Imprimir por consola mi nombre con un salto de linea
        System.out.println("My name is Alexander Azocar");
        //imprimir sin salto de linea
        System.out.print("Holaa" + "mundo");
        //imprimir en forma de error
        System.out.println("Tengo " + age + " mi color favorito es " + color + " y vivo en la ciudad de " + city);

        System.out.println("*" + "-" + "*");
    }
}
