package multithreading.problems.matrixmultiplication;

public class UsingThreads {

    public static void main(String[] args) throws InterruptedException {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {1, 2, 1},
                {2, 3, 1},
                {1, 1, 2}
        };

        if (A[0].length != B.length) {
            System.out.println("Matrix dimensions not compatible for multiplication!");
            return;
        }

        int rows = A.length;
        int cols = B[0].length;
        int[][] C = new int[rows][cols];

        Thread[] threads = new Thread[rows];

        for (int i = 0; i < threads.length ; i++) {
            threads[i] = new MatrixMultiplication(A , B , C , i);
            threads[i].start();
        }

        for (int j = 0; j < rows; j++) {
            threads[j].join();
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
