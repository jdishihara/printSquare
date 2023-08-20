public class hello3 {

    public static void main(String[] args) {
        // Example usage:
        int rows = 4;
        int cols = 1;
        printGrid(rows, cols);
        printGridJD(rows, cols);
    }
    public static void printGridJD(int rows, int cols) { //original version (correct)
        for (int x=1; x<=rows; x++){
            for (int y=1; y<=cols;y++){
                System.out.print(x+(y-1)*rows);
                System.out.print(",");
            }
            System.out.println ("");
        
        }
    }

    public static void printGrid(int rows, int cols) { //chatGPT version
        for (int col = 1; col <= cols; col++) {
            int num = col;
            for (int row = 1; row <= rows; row++) {
                System.out.print(num);
                if (row < rows) {
                    System.out.print(",");
                }
                num += cols;
            }
            System.out.println();
        }
    }
}





