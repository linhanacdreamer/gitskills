package pat1007;

import java.util.Scanner;

public class PAT1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		int len = a.length();
		int x = 0;
		boolean flag = false;
		for(int i = 0; i < len; i++){
			int remain = x * 10 + a.charAt(i) -'0'; 
			int s = remain/b;
			x = remain - s * b;
			if(!flag && s == 0){
				continue;
			}
			else flag = true;
		    sb.append(s);
		}
		String ans = sb.toString();
		System.out.println(ans +" "+x);
	}
}
