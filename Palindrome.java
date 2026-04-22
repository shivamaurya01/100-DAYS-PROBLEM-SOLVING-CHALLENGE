public class Palindrome {
    public static void main(String[] args) {
        int x = 143;

        if (x < 0) {
            System.out.print(false);
            return;
        }

        String str = String.valueOf(x);
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.print(false);
                return;   // stop here
            }
            i++;
            j--;
        }

        System.out.print(true);
    }
}