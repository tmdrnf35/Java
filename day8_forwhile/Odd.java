package day8_forwhile;

public class Odd {

	public static void main(String[] args) {
		//while문으로 1-10까지의 홀수만 출력하시오
		//홀수인지 판단하기
		int i =1;//초기값
		while(i<=10) { //조건
			
			if(i%2==1)//문장이 있어야 한줄의 명령이 됨
			System.out.println(i);
			i++;
		}
	}

}
