package easy;

import java.util.ArrayList;

public class SubArrayWIthGivenSum {
	
	public ArrayList<Integer> subarraySum(int arr[], int n , int s){
		
		ArrayList<Integer> list=new ArrayList<>();
		int sum=0;
		int st=0;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
//			System.out.println(sum);
			while(sum>s) {
				sum-=arr[st];
				st++;
			}
			if(sum==s && sum!=0) {
				list.add(st+1);
				list.add(i+1);
				return list;
			}
		}
		list.add(-1);
		return list;
	}
	
	public static void main(String[] args) {
		int N = 5; 
		int S = 12;
		int A[] = {1,2,3,7,5};
		ArrayList<Integer> s=new ArrayList<Integer>();
		SubArrayWIthGivenSum obj=new SubArrayWIthGivenSum();
		s=obj.subarraySum(A, N, S);
		
		for(Integer i: s) {
			System.out.print(i+" ");
		}
	}

}
