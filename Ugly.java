public class Ugly{
    public static void main(String[] args) {
        int n =10;
        if (n <= 0)System.out.print(false);

        int[] factors = {2, 3, 5};

        for (int f : factors) {
            while (n % f == 0) {
                n = n / f;
            }
        }
        System.out.println(true);

        
    }
}