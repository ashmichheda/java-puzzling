public class Confusing {
    private Confusing(Object o) {
        System.out.println("Object");
    }

    private Confusing(double[] dArray) {
        System.out.println("double array");
    }

    public static void main(String[] args) {
        new Confusing(null);
    }
}
