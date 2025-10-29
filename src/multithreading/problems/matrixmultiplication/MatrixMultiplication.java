package multithreading.problems.matrixmultiplication;

public class MatrixMultiplication extends Thread {

    int[][] A , B , C ;
    int row ;

    public MatrixMultiplication(int[][] a, int[][] b, int[][] c, int row) {
        A = a;
        B = b;
        C = c;
        this.row = row;
    }

    @Override
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            int sum = 0;
            for (int k = 0; k < B.length; k++) {
                sum += A[row][k] * B[k][j];  // ✅ accumulate properly
            }
            synchronized (C) {
                C[row][j] = sum;  // ✅ safe write
            }
        }
    }


}
