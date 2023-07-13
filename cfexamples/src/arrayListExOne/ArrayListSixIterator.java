package arrayListExOne;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSixIterator {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");
		enames.add("Mano");
		enames.add("Naveen");
		enames.add("Vasu");
		enames.add("Praveen");
		enames.add("Sumanth");
		
		Iterator itr=enames.iterator();
		//System.out.print(itr.hasNext());
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
	}

}
