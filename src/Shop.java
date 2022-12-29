import java.util.*;

public class Shop {

    private static final Random RANDOM = new Random();
    private static final Integer MAX_SIZE = 5;

    private static final List<String> NAMES = List.of("Иван Иванов", "Петр Петров", "Глеб Михайлов",
            "Евгений Воробьев", "Виктор Петров");

    public static Queue<String> cashRegister1 = new ArrayDeque<>();
    public static Queue<String> cashRegister2 = new ArrayDeque<>();

    public static Queue<String> cashRegister3 = new ArrayDeque<>();

    public static List<Queue<String>> queues = new ArrayList<>();

    public static void main(String[] args) {

        randomFilling(cashRegister1);
        randomFilling(cashRegister2);

        System.out.println(cashRegister1);
        System.out.println(cashRegister2);
        
        queues.add(cashRegister1);
        queues.add(cashRegister2);
        queues.add(cashRegister3);



    }

    public static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i <size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    public static void personFilling(String name) {
        if (!(cashRegister1.size()<MAX_SIZE && cashRegister2.size()<MAX_SIZE)) {
            System.out.println("Открывается новая очередь");
            cashRegister3.offer(name);
        } else {
            if (cashRegister1.size()<=cashRegister2.size()) {
                cashRegister1.offer(name);
            } else {
                cashRegister2.offer(name);
            }
        }
    }

    public static void remove() {
        queues.get(RANDOM.nextInt(queues.size())).poll();
    }

}
