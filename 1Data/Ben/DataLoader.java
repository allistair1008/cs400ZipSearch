import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataLoader {
	private ArrayList<Place> zipcodeList;// arraylist of the places
	private String csvPath;

	/**
	 * Default constructor. Loads csv from same directory.
	 */
	public DataLoader() {
		this("uszips.csv");
	}

	/**
	 * Loads csv from specified directory
	 * @param csvPath The specified path
	 */
	public DataLoader(String csvPath) {
		this.csvPath = csvPath;
		this.zipcodeList = new ArrayList<>();
		this.readData(this.csvPath);
	}

	private void readData(String csvPath) {
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(csvPath));
			String row = csvReader.readLine(); // Assigns header row
			while((row = csvReader.readLine()) != null) {
				String[] arrayRow = row.split(",");
				this.zipcodeList.add(new Place(Integer.parseInt(arrayRow[0]), arrayRow[1], arrayRow[4], arrayRow[3]));
			}
			csvReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: The file path specified does not exist or cannot be opened.");
		} catch (IOException e) {
			System.out.println("ERROR: Read error.");
		}
	}

	public ArrayList<Place> getData() {
		return this.zipcodeList;
	}
}