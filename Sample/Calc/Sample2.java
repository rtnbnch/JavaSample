
import java.util.Scanner;

class Sample2{
    public static void main(String[] args){
    int kor,eng,math;
    Scanner scanner = new Scanner(System.in);

    System.out.println("국어 점수?: ");
    kor = scanner.nextInt();

    System.out.println("영어 점수?: ");
    eng = scanner.nextInt();

    System.out.println("수학 점수?: ");
    math = scanner.nextInt();

    int sum = kor + eng + math;
    //int average= (kor+eng+math)/3.0;
    //int avg = (int)(sum / 3.0*100+0.5);
    
    //System.println("Average : "total / 3.0);
    System.out.println("세 과목의 총점은 "+sum+" 이며, 평균은 "+(sum / 3.0) +"입니다.");
    System.out.format("평균2은 : %.2f\n", sum / 3.0);
    }
}
