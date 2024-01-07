public class Hard_pattern_Ignite_assigment {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }

            for (int k = 0; k < 2 * i; k++) {
                System.out.print("  ");
            }

            for (int l = n - i; l >= 1; l--) {
                if (l != n)
                    System.out.print(l + " ");
                else
                    System.out.print(l);
            }

            System.out.println();
}

    }
}
