package algorithm_day1;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		/*reverse를 사용한 뒤집기
		 * for(int i=0 ; i<str.length ; i++) { String tmp = new
		 * StringBuilder(str[i]).reverse().toString(); answer.add(tmp); }
		 */
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		단어뒤집기 T = new 단어뒤집기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0 ; i<n ; i++) {
			str[i] = sc.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		sc.close();
	}
}
