// sum.java
/*
파일 명칭	: sum.java
함수 명칭	: main
기	능	    : 1부터 100까지의 수 중에서 홀수의 합을 구하다
입	력		: 없음
출	력		: 1부터 100까지의 홀수의 합
작 성 자	: 박 준 모
작성 일자	: 2021-10-4
*/

package sum;

public class Main
{
    public static void main(String[] args)
    {
        final int MAX = 99;  // 상수 변수들 선언
        int sum = 0;        // 지역변수 선언문들
        int oddNumber;
        int remainder;
       

        System.out.println("수\t\t\t합\n"); //제목을 출력하다
        
        for( oddNumber = 1; oddNumber <= MAX; oddNumber++)
        {
            remainder = oddNumber % 2;

            if(remain != 0)
            {
                sum += oddNumber;
                System.out.printf("%d\t\t\t%d\n", oddNumber, sum);
            }

        }

        System.out.println("\n합 :" + sum);
    }
}