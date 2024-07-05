public class Counter {
    private int instanceCount;
    public static int totalCount;
    private static int counterCount;
    private final int counterNumber;

    public Counter() {
        counterCount++;
        counterNumber = counterCount;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Counter " + counterNumber + ": \n" +
                "Instance Count = " + instanceCount + "\n" +
                "Total Count = " + totalCount;
    }
}
