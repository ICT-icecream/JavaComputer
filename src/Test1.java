public class Test1 {

	public static void main(String[] args) {
		String a = "123245+11";
		char arr[] = a.toCharArray();
		int b = 0;
		for(char i : arr) {
			int c = Integer.parseInt(String.valueOf(i));
			
			b = b * 10 + c;
			System.out.println(b);
		}

	}

}
//((((0 * 10 +1) * 10 + 2) * 10 + 3) * 10 + 4) * 10 + 5
