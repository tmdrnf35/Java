package day8_forwhile;

public class Even {

	public static void main(String[] args) {
		//1.for문을 이용해서 짝수만 출력하시오 ==
		//2.홀수로만 출력하시오 !=
		int i =0; //저장공간이 다름
		
		for(i =1; i<30; i++) {
			if(i %2 !=0)
				System.out.println(i);
		}//for
	}//main
}//class
