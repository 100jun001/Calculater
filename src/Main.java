import java.math.BigInteger;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

                     Scanner sc = new Scanner(System.in); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.      클래스 다이어그램: 계산기에 필요한 클래스를 설계합니다. 예를 들어, Calculator, Operation, Parser 등
        boolean answer = false;              // 탈출용
        boolean arithmetic = true;           // while문 시작용
        int a = 0;                           // 첫번째 숫자
        int b = 0;                           // 두번째 숫자
        String sign = "";       // 기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈), 괄호 사용, 제곱근, 제곱 등.

        while (arithmetic) {

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.println("계산기 입니다.");
            System.out.println("숫자와 사칙연산을 사용합니다. 음수는 사용 불가합니다.");
            System.out.println("계산할 첫번째 숫자를 입력하세요: ");

            try {
                a = sc.nextInt();
                sc.nextLine();
            } catch (RuntimeException e) {
                System.out.println("숫자 이외에는 입력하지 말아주세요.");
                continue;
            }

                if (a >= 0) {
                    break;
                } else {
                    System.out.println("입력값이 잘못되었습니다.");
                    System.out.println("양의 정수로 다시 입력해주세요.");
                }

        }

        while (arithmetic) {
            System.out.println("연산자는 +, -, *, /를 사용해주세요.");
            System.out.println("사용할 연산자를 입력하세요: ");

            sign = sc.next();
            sc.nextLine();

            if (sign.equals("+")) {
                System.out.println("더하기");
                break;

            } else if (sign.equals("-")) {
                System.out.println("빼기");
                break;

            } else if (sign.equals("*")) {
                System.out.println("곱하기");
                break;

            } else if (sign.equals("/")) {
                System.out.println("나누기");
                break;

            } else{
                System.out.println("입력값이 잘못되었습니다.");
            }
        }

        while(arithmetic){

            System.out.println("계산할 두번째 숫자를 입력하세요: ");

            try {
                b = sc.nextInt();
                sc.nextLine();
            } catch (RuntimeException e) {
                System.out.println("숫자 이외에는 입력하지 말아주세요.");
                continue;
            }

            if ( b == 0 && sign.equals("/")){

                System.out.println("0으로는 나누기를 할수없습니다.");
                System.out.println("다시 입력해주세요.");
                continue;

            }
            if (b >0) {
                if (sign.equals("+")) {
                    System.out.println("답은 다음과 같습니다.");
                    int c = a + b;
                    System.out.println(a + sign + b + "=" + c);
                    break;

                } else if (sign.equals("-")) {
                    System.out.println("빼기");
                    System.out.println("답은 다음과 같습니다.");
                    int d = a - b;
                    System.out.println(a + sign + b + "=" + d);
                    break;

                } else if (sign.equals("*")) {
                    System.out.println("곱하기");
                    int e = a * b;
                    System.out.println(a + sign + b + "=" + e);
                    break;

                } else if (sign.equals("/")) {
                    System.out.println("나누기");
                    double f = (double) a / b;
                    System.out.println(a + sign + b + "=" + f);
                    break;
                }
            } else {

                System.out.println("입력값이 잘못되었습니다.");
                System.out.println("양의 정수로 다시 입력해주세요.");
                return;
                }

            }


//      - 사용자 인터페이스 방식 : 콘솔
//      기능 분해: 주요 기능을 메소드로 분리 add(), subtract(), multiply(), divide(), evaluateExpression() 등.

//      - 예외 처리 : 0으로 나누기와 같은 오류를 처리
//      데이터 흐름 설계: 데이터가 클래스 간에 어떻게 흐를지를 결정합니다.입력, 처리, 출력의 흐름을 이해합니다

    }
}