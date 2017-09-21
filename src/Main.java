import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/20.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] upper = new char[27];
		upper['B'-'A'] = 'J';//当前值小于
		upper['C'-'A'] = 'B';
		upper['J'-'A'] = 'C';
		int[][] ans = new int[2][6];
		//  0 - 'B',1 - 'C',2 - 'J' 放获胜次数，3，4，5放胜,平,负
		for( int i = 0; i < n; i++){
			String a = sc.next();
			String b = sc.next();
			if(a.equals(b)){
				// a == b
				ans[1][4]++;
				ans[0][4] = ans[1][4];
			}
			else if(b.compareTo(upper[(a.charAt(0) - 'A')]+"") == 0){
				// a < b
				
			}
			else {
				
			}
		}
	}
}
