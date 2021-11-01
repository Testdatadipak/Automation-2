package calswitch;

public class calswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10, num2 = 5, res;
		char op = '/';
		switch (op) {
		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
		}
		System.out.println("ends here...");
	}

}
