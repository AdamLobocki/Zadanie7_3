public class Main {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            x = x + i;
            i++;
        }
        System.out.println("Suma: " + x);
    }
}
