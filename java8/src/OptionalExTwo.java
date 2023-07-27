import java.util.ArrayList;
import java.util.Optional;

public class OptionalExTwo {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("rahul");
		enames.add(null);
		enames.add("sonia");
		
		for(String ename:enames) {
			 System.out.println(ename.toUpperCase());
		 }
	}
}
