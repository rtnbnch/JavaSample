import java.util.Scanner;

class Sample{
        //class 선언 
        //class 안의 모든 것들은 멤버임 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int age, height;

        System.out.print("Input age: ");
        age = scanner.nextInt();

        System.out.print("Input height: ");
        height = scanner.nextInt();

        
        boolean result = (age>= 20 && height >= 170);
        System.out.println("나이가 20세 이상이고 키가 170cm 이상인 사람인가?" + result);

    
        //new는 heap 영역에 데이터를 생성함
        //모든 메모리는 실행 전에 결정이 되어야 함
        //실행 후 heap의 사이즈는 변하지 않음(리미트를 가지고 출발한 소리임)
        //따라서 stack은 유한함 ㅑ
        /*int a, b;

        System.out.print("Input number : ");
        a = scanner.nextInt();

        System.out.print("Input number : ");
        b = scanner.nextInt();

        System.out.println("a>b " + (a>b));
        System.out.println("a>=b " + (a>=b));
        System.out.println("a==b " + (a==b));
        System.out.println("a<=b " +(a<=b));
        System.out.println("a<b " +(a<b));

        */
    }

}


