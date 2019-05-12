import java.util.Random; 

public class Shuffle {
    private static Random rnd = new Random();
    public static void shuffle(Object[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, rnd.nextInt(a.length));
    }

    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
