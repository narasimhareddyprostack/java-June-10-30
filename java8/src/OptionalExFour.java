import java.util.ArrayList;
import java.util.Optional;

public class OptionalExFour {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("rahul");
		enames.add(null);
		enames.add("sonia");
		
		for(String ename:enames) {
			Optional<String> op=Optional.ofNullable(ename);
			if(op.isEmpty()) {
				System.out.println("Value is null");
			}
			else {
				System.out.println(op.get().toUpperCase());
			}
		 }
	}
}
