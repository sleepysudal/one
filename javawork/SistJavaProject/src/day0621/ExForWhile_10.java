package day0621;

public class ExForWhile_10 {

	public static void test1() {
		
		//for문으로 1~5까지 합 구하기(반복문안의 num을 sum에 더하는 문제)
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum+=i;
		}
		System.out.println("총합계는 "+sum);
		
	}
	
	public static void test2()
	{
		//1~10까지의 홀수합_for
		int sum=0;
		
		for(int i=1;i<=10;i+=2)
		{
			sum+=i;
		}
		System.out.println("총합계는 "+sum);
		
	}
	
	public static void test3() {
		
		//"100까지의 합은 5050입니다"  100은 변수로 처리해서 출력하시오...for
		int sum=0;
		
		int i;
		for(i=1;i<=100;i++)
		{
			sum+=i;
		}
		
		System.out.println((i-1)+"까지의 합: "+sum);
		
	}
	
	public static void main(String[] args) {
		
		//test1();
		//test2();
		test3();
	}

}
