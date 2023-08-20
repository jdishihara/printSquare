

/**
 * Hello
 */
public class Hello {

    public static void printSquareJD(int[] x) {
        printJD(x); // TODO replace with printJD(x);

        int temp = 0; // this will be used to hold the value of index 0
        int n = x.length;
        for (int j = 0; j < (n - 1); j++) {
            temp = x[0];

            for (int i = 0; i < n - 1; i++) {
                x[i] = x[i + 1];
            }
            x[n - 1] = temp;
            printJD(x); // TODO replace with printJD(x);

        }
    }

    public static void printJD(int[] x) {
        int k = x.length;
        for (int j = 0; j < k; j++) {
            System.out.print(x[j]);

        }
        System.out.println("");
    }


    public static void printSquare(int n, int m) {

        int[] x = new int[m - n + 1];
        for (int j = 0; j < m - n + 1; j++) {
            x[j] = n + j;
        }
        printSquareJD(x);

    }

    public static void main(String[] args) {

        // printSquare(4, 6);

        int[] x = { 1, 2, 3, 4, 5 };

        //printJD(x);
        printSquare(2, 5);

        // System.out.println("asd");

        // System.out.println("helll worls");

    }
}
