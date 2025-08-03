package com.java.tutorial;

public class Swapping {

	public void swapArray() {
		
		
		int a[] = { 12, 4, 7, 8, 9, 6, 8, 17, 9, 10};
		
//		for(int i =0; i<=a.length-1; i++) {
//			System.out.println(a[i]);
//		}
		
		for(int x : a) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		int n =10;
		System.out.println(a);
		int index = 0;
		for(int i =0; i<=a.length-1; i++) {
//			System.out.println(a[i]);
			if(a[i] == 6) {
				index = i;
			}
		}
		System.out.println(index);
		for(int j =6;j<=9;j++) {
			a[j-1] = a[j];
		}
		
		
		
//		Plumber p1 = new Plumber();
//		Plumber p2 = new Plumber();
//		Plumber p3 = new Plumber();
//		
//		Plumber a[] = {p1, p2, p3};
//		
//		System.out.println(a.length);
//		
//		for(int i =0; i <=2; i++) {
//			a[i].fixTap();
//		}
		
		
		
	
//		int y = 20;
//		Integer x = 20;
//		Integer m = new Integer(20);
		
//		int n = 300;
//		int a[] = new int[n]; //declaration
////		String a[] = new String[n];
//		//byte a[] = new byte[n];
//		for(int i =0; i<=n-1;i++) {		//Initialization
//			a[i] = (byte) (i+1);
//			if (i==0)
//				a[0] = p;
////			if(i==1)
////				a[1] = 'B';
////			if(i==2)
////				a[2] = '*';
////			if(i==3)
////				a[3] = '&';
////			if(i==4)
////				a[4] = 'a';
//		}
//
//		int temp = 0;
////		int n = 10;
////		for (int i = 0; i < (n / 2) - 1; i++) {
////			temp = a[i];
////			a[i] = a[n - 1 - i];
////			a[n - 1 - i] = temp;
////		}
//		
		for(int j=0;j<=n-1; j++) {
			System.out.println("a["+j+"] -> "+ a[j]);
			
		}
	}

}
