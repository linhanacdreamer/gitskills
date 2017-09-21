package pat1010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product{
	public int id;
	public double perPrice;/*
	@Override
	public int compareTo(Product o) {
		double x = o.perPrice - perPrice ;
		if(Math.abs(x) <= 0.00000001 ) return 0;
		if(x > 0) return 1;
		return -1;
	}*/
}
public class PAT1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//n+
		double required = sc.nextInt();
	
		double[] s = new double[n];		
		double[] m = new double[n];	
		for(int i = 0 ; i < n; i++){
			s[i] = sc.nextDouble();//+
		}
		for(int i = 0 ; i < n; i++){
			m[i] = sc.nextDouble();//+
		}
		ArrayList list = new ArrayList();
		for(int i = 0 ; i < n; i++){
			Product p = new Product();
			p.id = i;
			if(Math.abs(s[i] - 0)<= 0.0000000001) continue;
			p.perPrice = m[i] / s[i];
			list.add(p);
		}
		Collections.sort(list, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				double x = o2.perPrice - o1.perPrice ;
				if(Math.abs(x) <= 0.00000001 ) return 0;
				if(x > 0) return 1;
				return -1;
			}
			
		});
		double ans = 0;
		for(int i = 0; i < list.size(); i++){
			Product p = (Product) list.get(i);
			double min = Math.min(required, s[p.id]);
			ans +=  p.perPrice * min;
			required -= min;
		}
		System.out.printf("%.2f\n",ans);
	}
}
