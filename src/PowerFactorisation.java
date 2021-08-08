public class PowerFactorisation {
    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);

        System.out.print("The prime factorization of is:"+n);

        for (long i = 2; i*i<= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}
