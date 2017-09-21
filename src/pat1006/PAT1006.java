package pat1006;

import java.util.Scanner;

public class PAT1006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sa = sc.next();
		String a = sc.next();
		String sb = sc.next();
		String b = sc.next();
		int pa = 0;
		int pb = 0;
		for(int i = 0; i < sa.length(); i++){
			if(a.equals(sa.charAt(i)+"")){
				pa = pa * 10 +(a.charAt(0) - '0');
			}
		}
		for(int i = 0; i < sb.length(); i++){
			if(b.equals(sb.charAt(i)+"")){
				pb = pb * 10 +(b.charAt(0) - '0');
			}
		}
		System.out.println(pa+pb);
	}
}
