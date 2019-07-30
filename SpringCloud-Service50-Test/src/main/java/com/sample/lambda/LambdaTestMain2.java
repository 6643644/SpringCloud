package com.sample.lambda;

/**
 * <p>
 * JAVA8 的 Lambda 學習(2)
 * </p>
 * 
 * 表示式語法 (parameters) -> expression or (parameters) ->{ statements; }
 * 
 * 
 * @author miles
 * @version 1.0, 2018/09/28
 * @see
 * @since
 */
public class LambdaTestMain2 {

	public static void main(String[] args) {
		LambdaTestMain2 tester = new LambdaTestMain2();

		// 相當於產生該實體並且實作
		MathOperation addition = (int a, int b) -> a + b;

		MathOperation subtraction = (a, b) -> a - b;

		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// 回傳一個參數為a除以b的結果
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		
		//有一個傳入參數 直接呼叫實體並且呼叫sayMessage()方法
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		
		GreetingService greetService2 = (message) ->System.out.println("Hello " + message);
		
		greetService1.sayMessage("Runoob");
		
		greetService2.sayMessage("Google");

	}

	// 一個 interface 有一個方法，該方法兩個傳入參數
	interface MathOperation {
		int operation(int a, int b);
		// 如果有兩個以上，會導致實作Lambda時無法判定需要使用哪一個方法進行實作。
//		int operation2(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
