package arrayListExOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSevenDataOperations {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");
		enames.add("Mano");
		enames.add("Naveen");
		enames.add("Vasu");
		enames.add("Praveen");
		enames.add("Sumanth");
		enames.add("AB");
		
		System.out.println(enames);
		//Collections.sort(enames); //Natural Sorting order ie digit 0 to 0 / a to z
		Collections.sort(enames,Collections.reverseOrder()); 
		System.out.println(enames);
		
		System.out.println("**After Shuffle**");
		Collections.shuffle(enames);
		System.out.println(enames);
	}

}
