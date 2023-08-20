import java.util.Arrays;

/**
 * Hello
 */
public class Hello {
    public static void mymethod() {
        System.out.println("There's one thing every coder must understand:\n" + //
                "The System.out.println command.\n");
    }

    public static void mymethod(int n) {

        /*
         * int count = 1;
         * while (count <= n) {
         * System.out.println("There's one thing every coder must understand:\n" +
         * "The System.out.println command.\n");
         * count++;
         * }
         */

        for (int j = 1; j <= n; j++) {
            System.out.println("There's one thing every coder must understand:\n" +
                    "The System.out.println command.\n");
        }

    }

    public static void stewie2(int n) {
        if (n <= 0) {
            System.out.println("n must be a positive integer");
            return;
        }
        int count = 1;
        System.out.println("//////////////////////");
        while (count <= n) {
            System.out.println("|| Victory is mine! ||");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            count++;
        }
    }

    public static void printSquareJD(int[] x) {
    System.out.println(Arrays.toString(x));
        int temp = 0; // this will be used to hold the value of index 0
        int n = x.length;
        for (int j = 0; j < (n - 1); j++) {
            temp = x[0];

            for (int i = 0; i < n - 1; i++) {
                x[i] = x[i + 1];
            }
            x[n - 1] = temp;
            System.out.println(Arrays.toString(x));

        }
    }
     public static void printSquare(int n, int m) {
    
         int[] x = new int [m-n+1];
        for(int j=0; j<m-n+1; j++){
            x[j]=n+j;
        }
        printSquareJD(x);
        
    }


    public static void main(String[] args) {

        printSquare(4, 9);
    }
}
