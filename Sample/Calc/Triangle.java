import java.util.Scanner;

class Triangle {
	public static void main(String[] args) {

		int tri1;
		int tri2;
		Scanner scanner = new Scanner(System.in);
	
	System.out.print("삼각형의 밑변은? ");
	tri1 = scanner.nextInt();

	System.out.print("삼각형의 높이는? ");
	tri2 = scanner.nextInt();

	System.out.println("삼각형의 넓이는 "+((tri1*tri2)/2)+"입니다.");
	}

    
}

//예제 1
//class calcTriangle{
   // public static void main(String[] args) throws Exception {
    
       // int width, height;
        //Scanner scanner = new Scanner (System.in);

       // System.out.print("밑변 : ");
       // width = scanner.nextInt();

       // System.out.print("높이 : ");
       // height = scanner.nextInt();

       // System.out.println("Area of triangle: " +(width * height / 2.0));
   // }
//}

//예제2 double
//import java.util.Scanner;

   // class CalcTriangle{
       // public static void main(Strint[] args) throws Exceptiong {
       // double width.height;
       // Scanner scanner = new Scanner(System.in);

       // System.out.print("Input width: ");
        //만약 입력을 숫자가 아닌 문자로 한다면?
        //100,000 or 1000. 10000.00
       // radius = scanner.nextDouble();

       // System.out.println("Area or triangle: "+(width * height / 2.0));
       // }
   // }


