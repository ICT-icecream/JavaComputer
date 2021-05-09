import java.util.Scanner;

public class ad {
	public static void main(String[] args) {
		String a = "12+22";
		Scanner sc = new Scanner(System.in);
	while(a!="0") {
		a = sc.nextLine();
		if(a.charAt(0)=='0') {
			return;
		}
		char Number1 = a.charAt(0);
		char Number1_2 = a.charAt(1);
		char fuhao = a.charAt(2);
		char Number2 = a.charAt(3);
		char Number2_2 = a.charAt(4);
		int Number = Integer.parseInt(String.valueOf(Number1));
		int Number_2 = Integer.parseInt(String.valueOf(Number1_2));
		int NumberTwo = Integer.parseInt(String.valueOf(Number2));
		int NumberTwo_2 = Integer.parseInt(String.valueOf(Number2_2));
		Number = Number * 10 + Number_2;
		NumberTwo = NumberTwo * 10 + NumberTwo_2;
		switch (fuhao) {
		case '+':System.out.println(Number+NumberTwo);break;
		case '-':System.out.println(Number-NumberTwo);break;
		case '*':System.out.println(Number*NumberTwo);break;
		case '/':System.out.println(Number/NumberTwo);break;
		default:
			break;
		}
	}
	}
	
}
