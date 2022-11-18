import java.util.ArrayList;

public class javapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		int[] arr = {1,2,3,4,5,6,7,8,9,0,11,22,33,44,55,66};
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
//		
//		for (int i=0 ; i < arr.length; i++) {
//			
//			System.out.println(arr[i]);
//			
//		}
//		
//		for (int mahesh : arr) {
//			if (mahesh % 2 == 0) {
//			System.out.println(mahesh + "divided by 2");
//			}
//			else {
//				System.out.println(mahesh + "not divided by 2");
//			}
			
//			ArrayList<String> mahesh1 = new ArrayList<String>();
//			mahesh1.add("venkatesh");
//			System.out.println(mahesh1.get(0));
//			
			
		
	String a = "burra venkatesh mahesh";
	String [] laxmi = a.split(" ");
//	System.out.println(laxmi[0]);
//	System.out.println(laxmi[1]);
//	System.out.println(laxmi[2]);
	
//	for (String  i : laxmi) {
//		System.out.println(i);
//	}
	
		for (int i = a.length()-1; i>=0 ; i--) {
			System.out.print(a.charAt(i));
			
		}
		
	}

}
