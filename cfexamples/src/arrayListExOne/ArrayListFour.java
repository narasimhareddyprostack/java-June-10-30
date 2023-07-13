package arrayListExOne;

import java.util.ArrayList;

public class ArrayListFour {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");
		enames.add("Mano");
		enames.add("Naveen");
		enames.add("Vasu");
		enames.add("Praveen");
		enames.add("Sumanth");
		for(int i=0;i<=enames.size()-1; i++) {
			System.out.println(enames.get(i));
		}
		
		
	}

}
