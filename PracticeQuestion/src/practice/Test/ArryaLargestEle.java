package practice.Test;

public class ArryaLargestEle {

	public static void main(String[] args) {

		int [] a = {5,10,3,15,6,1,9,12,56};
		int lar = a[0];
		int sec = 0;
		for(int i = 0; i<a.length;i++) {
			
			if(lar<a[i]) {
				sec = lar;
				lar = a[i];
				
			}
			
		}
		System.out.println("Largest Element : " + lar);
		System.out.println("Second Largest Element : " + sec);

	}

}
