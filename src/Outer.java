public class Outer {
    public static void main(String[] args) {
        int i=4;

    }
    static class inner extends Outer
    {
        public static void main(String[] args) {
            System.out.println();
        }
    }

}

