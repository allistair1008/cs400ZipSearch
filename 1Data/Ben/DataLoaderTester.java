// --== CS400 File Header Information ==--
// Name: Benjamin Ryan Wurster
// Email: bwurster@wisc.edu
// Team: DC
// TA: Yelun
// Lecturer: Gary Dahl
// Notes to Grader: None

import java.util.ArrayList;

public class DataLoaderTester {

	public static void main(String[] args) {
		DataLoader data = new DataLoader();
		ArrayList<Place> list = data.getData();
		for(int i = 18220; i < 18230; i++) {
			System.out.println(list.get(i));
		}
	}

}
