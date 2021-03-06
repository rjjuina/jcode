package books.mcp.matrixmultiplier.concurrency2;

import books.mcp.matrixmultiplier.MatrixGenerator;
import books.mcp.matrixmultiplier.concurrency1.ParallelIndividualMultiplier;

import java.util.Date;

public class ParallelRowMultiplierMain {

    public static void main(String[] args) {
        double[][] matrix1 = MatrixGenerator.generate(2000, 2000);
        double[][] matrix2 = MatrixGenerator.generate(2000, 2000);

        double[][] resultMatrix = new double[matrix1.length][matrix2[0].length];

        Date startDate = new Date();
        ParallelIndividualMultiplier.multiply(matrix1, matrix2, resultMatrix);
        Date endDate = new Date();

        System.out.printf("ParallelIndividual %d%n", endDate.getTime() - startDate.getTime());
    }
}
