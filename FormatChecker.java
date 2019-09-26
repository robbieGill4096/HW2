import java.io.File;
import java.util.Scanner;

public class FormatChecker {
	
	public static void checkFormat(String fileName) throws Exception {
		//read in the file 
		File file = new File(fileName);
		Scanner reader = new Scanner(file);
		
		
		
		//check that dimensions are correct if any of these are invalid throw dimension mismatch
		
		
		String[] dimensionValues = reader.nextLine().split("\\s+");
		
		int numberOfDimensions = dimensionValues.length;
		
		if (numberOfDimensions != 2) {
			//throw dimension mismatch
			throw new DimensionMismatchException();
		}
		int R = Integer.parseInt(dimensionValues[0]);
		int C = Integer.parseInt(dimensionValues[1]);
		int rowCount = 0;
		String gridString = "";
		//check r and columns R C have correct number of arguments
		while (reader.hasNextLine()){
			String currentRow = reader.nextLine() + " ";
			int numberOfColumns = currentRow.split("\\s+").length;
			if (numberOfColumns != C) {
				System.out.println("incorrect Number of Columns");
				throw new DimensionMismatchException();
			}
			gridString += currentRow;
			rowCount+=1;
			
			
			
		}
		if (rowCount != R) {
			System.out.println("incorrect Number of Rows");
			throw new DimensionMismatchException();
		}
		//check if contests are numbers 
		//check that they proper data type
		
		String[] StringGridValues = gridString.split("\\s+");
		for(String value: StringGridValues) {
			Double.parseDouble(value);
			
		}
		
		
		
		
		// check that rows and columns are correct 
		
		
		
	}

	public static void main(String[] args) {
		
		try {
			checkFormat("valid1.dat");
			
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		
			
		}
		//System.exit(0);

	}

}
