package streamApiEx;

import java.util.stream.Stream;

public class StreamAPIOne {

	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(10,20,30,40);
		s.map(ele->ele+1).forEach(value->System.out.println(value));

	}

}
