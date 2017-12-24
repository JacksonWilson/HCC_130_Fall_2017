package labs.lab29;

import java.io.IOException;

import utils.KeyboardReader;

public class Matrix {
	private double [][] matrix;

	public Matrix () throws IOException {
		int row = KeyboardReader.getInstance().readInt("Enter rows: ");
		int col = KeyboardReader.getInstance().readInt("Enter cols: ");

		this.matrix = new double[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = KeyboardReader.getInstance().readDouble("Enter element " + i + ", " + j + ": ");
			}
		}
	}

	public Matrix (int row, int col, boolean requestValues) throws IOException {
		this.matrix = new double[row][col];

		if (requestValues)
			for (int i = 0; i < row; i++)
				for (int j = 0; j < col; j++) {
					this.matrix[i][j] = KeyboardReader.getInstance().readDouble("Enter element " + i + ", " + j + ": ");
			}
	}

	public Matrix(double [][] m) {
		matrix = m;
	}
	
	public Matrix scalarMultiplication(double scalar) {
		double [][] result = new double[matrix.length][matrix[0].length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = matrix[i][j] * scalar;
			}
		}

		return new Matrix(result);
	}
	
	public Matrix add(Matrix summand) throws IOException {
		double[][] sum = new double[matrix.length][matrix[0].length];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = matrix[i][j] + summand.matrix[i][j];
			}
		}

		return new Matrix(sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Matrix) {
			Matrix other = (Matrix)obj;
			if (matrix.length == other.matrix.length) {
				for (int i = 0; i < matrix.length; i++) {
					if (matrix[i].length != other.matrix[i].length)
						return false;

					for (int j = 0; j < matrix[i].length; j++) {
						if (matrix[i][j] != other.matrix[i][j])
							return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public void displaySelf() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
	}
}
