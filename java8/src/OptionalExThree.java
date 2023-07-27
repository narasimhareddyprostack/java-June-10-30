import java.util.ArrayList;
import java.util.Optional;

public class OptionalExThree {

	public static void main(String[] args) {
		
		//String ename = "Rahul";
		String ename = null;
		//System.out.println(ename.length());
		
		Optional<String> op = Optional.ofNullable(ename);
		if(op.isEmpty()) {
			System.out.println("Value Null");
		}
		else {
			
			System.out.println(op.get().toUpperCase());
		}
	}

}
