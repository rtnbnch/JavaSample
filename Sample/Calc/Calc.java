import java.util.Scanner;

class Calc {
	private static final double Pl = 3.141592;

	public static void main(String[] args) throws Exception {
		//
		// 변수 선언
		final double Pl = 3.141592;
		int radius;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input radius: ");
		radius = scanner.nextInt();

		System.out.println("Area of square : " +(radius * radius));
		System.out.println("Area of circle: " + Pl * (radius * radius));
		System.out.println("Area of circle: " + Calc.Pl * (radius * radius));
			//정적 멤버의 접근
	}
}

