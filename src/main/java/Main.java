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

        Counter counter3 = new Counter();
        System.out.println(counter3);
        System.out.println(counter1);

        System.out.println(Calculator.add(3,4));
    }
}
