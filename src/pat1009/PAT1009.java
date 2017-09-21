package pat1009;

import java.util.Scanner;

public class PAT1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = new char[4];
		String string = sc.next();
		int len = string.length();
		for(int i = 0; i < 4; i++){
			if(i < 4 - len) s[i] = '0';
			else s[i] = string.charAt(i - 4 + len);
		}
		
		int[] de = new int[10];
		
		for(int i = 0;i < 10; i++){
			de[i] = 0;
		}
		
		int last = 0;
		while(last != 6174){
			for(int i = 0;i < 4; i++){
				de[s[i] - '0'] ++;
			}
			
			StringBuffer sb1 = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			for(int i = 0 ; i < 10; i++){
				int count = de[ i ];
				
				while((count--) > 0)
					sb1.append(i);
				
				int count2 = de[9 - i];
				while((count2--) > 0){
					sb2.append(9-i);
				}
			}
			int num1 = Integer.valueOf(sb1.toString());
			int num2 = Integer.valueOf(sb2.toString());
			last = num2 - num1;
			System.out.printf("%04d - %04d = %04d\n",num2,num1,last);	
			s = (last+"").toCharArray();
			for(int i = 0;i < 10; i++){
				de[i] = 0;
			}
		}
	}
}
