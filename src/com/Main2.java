package com;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exit = "";
        //null값과 빈값의 차이

        int a = 0;
        int b = 0;

        do{
            // 1. 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = inputNum();


            System.out.print("두 번째 숫자를 입력하세요: ");
            b = inputNum();


            // 2. 사칙연산
            System.out.print("사칙연산 기호를 입력하세요: ");
            char sign = scanner.next().charAt(0);   //
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

            // 3. 계산하기
            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            switch (sign) {
            case '+':
                result = a + b;
                System.out.println("결과: " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("결과: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("결과: " + result);
                break;

            case '/':
                if (b > 0) {
                    result = a / b;
                    System.out.println("결과: " + result);
                    break;
                } else if (b == 0) {
                    System.out.println("0으로는 나누기를 할수없습니다.");

                }
                default:
                    System.out.println("사칙연산 +-*/를 입력해 주세요.");
                    continue;
        }
            // 4. 반복문 사용
            scanner.nextLine();         // null값, 빈값 차이
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("계속 하시려면 enter를 눌러주세요.");
            exit = scanner.nextLine();  // 빈 값
                        /* exit을 입력 받으면 반복 종료 */
        }while(!"exit".equals(exit));

    }

    private static int inputNum() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        while(true){
            try {
                a = scanner.nextInt();
                scanner.nextLine();
                break;
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            } catch (RuntimeException e) {
                System.out.println("숫자 이외에는 입력하지 말아주세요.");
                scanner.nextLine();
            }
        }
        return a;
    }
}
