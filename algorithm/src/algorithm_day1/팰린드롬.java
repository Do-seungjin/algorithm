package algorithm_day1;

import java.util.Scanner;

public class 팰린드롬 {
	public String solution(String s) {
		String answer = "NO";
		
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		팰린드롬 T = new 팰린드롬();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		sc.close();
	}
}
