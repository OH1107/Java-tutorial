package loopexample;

public class WhileExample2 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num < 1);
		
		System.out.println(sum);
	}

}
