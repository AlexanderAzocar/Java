package Estructuras.Exercises;

import java.util.*;

public class Exercises {

    public static int checkLength(int[] numero ){
        return numero.length;
    }

        public static HashMap<Integer, Integer> convertir(Integer[] numero) {

            if( numero == null || numero.length == 0){
                System.out.println("Ingresa un array valido que no este vacio");
                return new HashMap<>();
            }

            List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(numero));

            Set<Integer> hashSet = new HashSet<>(arrayList);

            HashMap<Integer, Integer> resultadoHashMap = new HashMap<>();

            for (Integer elemento : hashSet) {
                resultadoHashMap.put(elemento, elemento);
            }
            return resultadoHashMap;
        }


    public static void main(String[] args){
        int[] array = {33,34,434,553,234};
        checkLength(array);

        System.out.println(array[1]);

        array[1] = 45;

        System.out.println(array[1]);

        var arrayList = new ArrayList<Integer>();

        arrayList.add(0,45);
        arrayList.add(43);
        arrayList.addLast(65);
        arrayList.addFirst(54);
        arrayList.add(54);
        arrayList.remove(2);

        var hashSet = new HashSet<Integer>();
        hashSet.add(54);
        hashSet.add(87);
        hashSet.add(104);
        hashSet.add(74);
        hashSet.add(54);
        hashSet.remove(54);

        var hashMap = new HashMap<String, Long>();

        hashMap.put("Alexander", 4242933271L);
        hashMap.put("Maryuri Lozano", 4123986247L);
        hashMap.put("Tiago", 4241244124L);

        System.out.println(hashMap.get("Alexander"));

        hashMap.remove("Tiago");
        hashMap.replace("Maryuri Lozano", 458273832L);

        Integer[] arrayI = {33,44,545,5432,5235,562};

        var result = convertir(arrayI);
        System.out.println(result);
    }


}
