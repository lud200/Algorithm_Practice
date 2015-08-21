
public class missingConsecutive {
	public static void main(String args[]){
		int[] a = {1, 2, 3, 4, 6, 7};
		int n = a.length;
		int sum1 = n*(n+1)/2;
		for(int i=0;i<n-1;i++){
			sum1=sum1-a[i];
		}
		System.out.println(sum1);		
	}
}
