package basics;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber p = new PrimeNumber();
        p.prime(23);
    }

    void prime(int n) {
        if (n == 2) {
            System.out.println("Prime Number");
            return;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Prime Number");
                break;
            }

        }
        System.out.println("Not a prime Number");

    }

}
