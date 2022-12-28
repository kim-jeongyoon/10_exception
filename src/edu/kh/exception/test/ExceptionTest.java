package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*while(true) {
			System.out.println("0입력 시 종료");
			int input = sc.nextInt();
			
			//탈출구문
			if(input == 0) {
				break;
			}
			// 0 입력시 종료되도록 함.			
		}*/
		
		//런타임에러: 프로그램 수행 중 발생하는 에러
		// 주로 if 문으로 처리가 가능
		
		int[] arr =new int[3]; // 길이:3---> 인덱스 0,1,2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if( 3 >= arr.length) {
			System.out.println("배열범위초과");
		} else {		
		arr[3] = 40;
		}
		
		//시험문제 두가지
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// 배열에서 부적절한 인덱스에 접근하려고 할 때 발생할 수 있는 예외
		
		// NegativeArraySizeException : 배열이 음수의 크기일때 발생 예외
		//배열의 크기로 음수를 제시했을 때 발생할 수 있는 예외 int[] arr = new int [-3]
		
		// 3개짜리 범위를 벗어났다는 에러 뜸
		
		
		
		
	
		// 입력시 정수가 아닌 것을 입력하면 MismatchException 발생 
		
		
		
		
		
	//=======================================================================================
	//	int a = 99.9;  컴파일에러(코드로 수정 가능한 경우)
	// 방법1) 강제형변환 int a = (int) 99.9;
	// 방법2) 자료형을 double 변경 double a = 99.9;
	// 방법3) 99.9 --> 정수로 변경
		
		
		
		
		
		
	}

}
