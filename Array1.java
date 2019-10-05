import java.util.*;
public class Array1 {
	public static void main(String[] args){
		
	
	//arrays.toSting(arr_name) to disp the elements of the arr
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		
	}
	Arrays.toString(arr);

}
}