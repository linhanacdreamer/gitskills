package pat1005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Stu implements Comparable<Stu>{
	public String id;
    public int d;
    public int c;
    public String total;
	@Override
	public int compareTo(Stu o) {
		return o.total.compareTo(total);
	}
}
/**
 * Created by Administrator on 2017/9/20.
 */
public class PAT1005 {
    static int n;
    static int l;
    static int h;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        h = sc.nextInt();
        List<Stu> stuList = new ArrayList<Stu>();
        for(int i = 0; i < n; i++){
        	Stu stu = new Stu();
        	stu.id = sc.next();
        	stu.d = sc.nextInt();
        	stu.c = sc.nextInt();
        	if(stu.d < l || stu.c < l){
        		continue;
        	}
        	StringBuffer sb = new StringBuffer();
        	if(stu.d >= h && stu.c >= h){
        		sb.append("22");
        	}else if(stu.d >= h){
        		sb.append("21");
        	}
        	else sb.append("00");
        	
        	if(stu.d < h)
        		sb.append(stu.d >= stu.c? '1' : '0');
        	else sb.append('0');
        	
        	
        	sb.append(stu.d + stu.c);//算到总得分:降序
        	if(stu.d < 100) sb.append('0');
        	sb.append(stu.d);//3位德分  降序
        	
        	for(int j = 0; j < 8; j++){
        		sb.append('9' - stu.id.charAt(j));//8位 学号 升序
        	}
        	stu.total = sb.toString();
        	stuList.add(stu);
        }
        Collections.sort(stuList);
        int len = stuList.size();
        System.out.println(len);
        for(int i = 0; i < len; i++){
        	Stu stu = stuList.get(i);
        	System.out.println(stu.id+" "+stu.d+" "+stu.c);
        }
    }
}
