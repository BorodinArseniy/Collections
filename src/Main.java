import java.beans.Introspector;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class Main{




    static Map<String, Integer> map = new HashMap<>();



    public static void addNumberToMap(String s, Integer i){
        if (map.containsKey(s) && map.get(s) == i){
            throw new RuntimeException("Такое элемент уже есть");
        }
        map.put(s, i);
    }
    public static void main(String[] args) {

        //map

        Random random = new Random();

        map.put("a", random.nextInt(15));
        map.put("b", random.nextInt(15));
        map.put("c", random.nextInt(15));
        map.put("d", random.nextInt(15));
        map.put("e", random.nextInt(15));
        map.put("f", random.nextInt(15));
        map.put("g", random.nextInt(15));
        map.put("h", random.nextInt(15));
        map.put("i", random.nextInt(15));



        //task1

        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer sb =new StringBuffer();


        Map<String, List<Integer>> map1 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map1.put(String.valueOf(sb.append(str.charAt(random.nextInt(10)))), Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        }

        for (Map.Entry<String, List<Integer>> map: map1.entrySet()){
            System.out.println(map.getKey() + " —> " + map.getValue());
        }



        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> map:
        map1.entrySet()) {
            int sum = map.getValue().stream().mapToInt(Integer::intValue).sum();
            newMap.put(map.getKey(), sum );
        }
        for (Map.Entry<String, Integer> map: newMap.entrySet()){
            System.out.println(map.getKey() + " —> " + map.getValue());
        }




        //task2
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map2.put(random.nextInt(), String.valueOf(sb.append(str.charAt(random.nextInt(10)))));
        }

        System.out.println(map2);





        //example();


        Random rand = new Random();
        Set<Integer> set = new HashSet<>();
        while(set.size() < 20) {
            set.add(rand.nextInt(1000));
        }

        set.removeIf(number -> number % 2 ==1);
        System.out.println(set);



        ////


        Set<Multiply> multiplies = new HashSet<>();
        while (multiplies.size()<15){
            Multiply multiply = new Multiply( rand.nextInt(7) + 2, rand.nextInt(7) + 2);
            multiplies.add(multiply);
        }
        System.out.println(multiplies);

        /////

        PassportList list = new PassportList(Set.of(new Passport("1234",
                "A", "B", "C", LocalDate.now().minusYears(25))));
        System.out.println(list);

        //HashSet, так как проверка ускоряется проверкой hash-а


    }

    private void process(Collection<Integer> firstCollection, List<Integer> list) {
        if (firstCollection.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
    }

    static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (!((i+j)%2==0)) {
                    biDemArrList.get(i).add(j, "◯");
                } else {
                    biDemArrList.get(i).add(j, "●");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
