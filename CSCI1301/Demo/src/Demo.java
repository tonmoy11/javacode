
public class Demo {
	public static void main(String[] args) {

		String s1, s2;
		s1="Hello John";
		s2="Hello John";
		
		System.out.println(s1.equals(s2));
		
		String test="abcdefg";
		System.out.println(test.substring(3));
		test=test.substring(3);
		System.out.println("Remaining Line:"+test);
	}
}