public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.incrementInstanceCount();
        counter1.incrementInstanceCount();
        Counter.incrementTotalCount();
        System.out.println(counter1);

        Counter counter2 = new Counter();
        counter2.incrementInstanceCount();
        Counter.incrementTotalCount();
        System.out.println(counter2);
        System.out.println(counter1);
    }
}
