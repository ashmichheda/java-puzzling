class Base {
    public String className = "Base";
}

class Derived extends Base {
    private String className = "Derived";
}

public class PrivateMatter {
    public static void main(String[] args) {
        System.out.println(new Derived().className);
    }
}
