package arrayandstrings;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[2][3];
		
		arr[0][0]=58;
		arr[0][1]=45;
		arr[0][2]=67;
		
		arr[1][0]=89;
		arr[1][1]=45;
		arr[1][2]=78;
		
		System.out.println(arr[1][1]);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int a[][]= {{1,2},{3,4},{5,6}};
		
		System.out.println(a[2][1]);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
