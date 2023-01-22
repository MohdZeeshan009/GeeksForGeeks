package easy;

import java.util.ArrayList;
import java.util.Collections;

public class GCDArray {

	
	public static int solve(int arr[], int n, int k) {
		
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
		}
		ArrayList<Integer> v=new ArrayList<>();
		for(int i=1; i*i<=sum;i++) {
			if(sum%i==0) {
				v.add(sum/i);
				if(i*i!=sum) {
					v.add(i);
				}
			}
		}
		Collections.sort(v, Collections.reverseOrder());
		int cnt;
		int ans=1;
		sum=0;
		for(int j=0; j<v.size(); j++) {
			int x=v.get(j);
			cnt=0;
			sum=0;
			for(int i=0; i<n; i++) {
				sum+=arr[i];
				if(sum%x==0) {
					cnt++;
					sum=0;
				}
			}
			if(cnt>=k) {
				return v.get(j);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {

		int arr[]= {6, 7, 5, 27, 3};
		int arr1[] = {1, 4, 5};
		int k=2;
		int n=arr1.length;
		int ans=solve(arr1,n,k);
		System.out.println(ans);
				
	}
}
