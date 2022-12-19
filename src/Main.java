import java.beans.Introspector;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class Main{
    public static void main(String[] args) {


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
