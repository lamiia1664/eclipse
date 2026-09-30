package arrayandstrings;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[6];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] =4;
		arr[4] = 5;
		arr[5] = 6;
		
		System.out.println("Array length : "+(arr.length));
		System.out.println(arr[3]);
		
		System.out.println("Elements: ");
		for (int i=0; i<arr.length; i++) { 
			System.out.println(arr[i]);
		}
		
		//Array Declaration with Initialization
		
		int array[]= {10,20,30,40};
		System.out.println(array[3]);
		for(int i=0;i<4;i++) {
			System.out.println(array[i]);
		}

	}

}
