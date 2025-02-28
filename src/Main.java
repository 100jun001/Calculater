import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("계산기 입니다.");
        System.out.println("숫자와 사칙연산을 사용합니다.");
//               기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈), 괄호 사용, 제곱근, 제곱 등.
//              클래스 다이어그램: 계산기에 필요한 클래스를 설계합니다. 예를 들어, Calculator, Operation, Parser 등
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
//                - 사용자 인터페이스 방식 : 콘솔
//        기능 분해: 주요 기능을 메소드로 분리 add(), subtract(), multiply(), divide(), evaluateExpression() 등.

//                - 예외 처리 : 0으로 나누기와 같은 오류를 처리
//              데이터 흐름 설계: 데이터가 클래스 간에 어떻게 흐를지를 결정합니다.입력, 처리, 출력의 흐름을 이해합니다
    }
}