package home;

public class array {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] b= {3,2,1};
		
		int length=b.length;
		
		if (a.length>b.length) {
			length=a.length;
		}
		for (int i = 0; i <length; i++) {
		try {
			System.out.println(a[i]+b[i]);
		} catch (Exception e) {

			if (a.length>b.length) {
				System.out.println(a[i]);
			} else {
                System.out.println(b[i]);
			}
		}
		}
		}

}
