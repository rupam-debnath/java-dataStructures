package dataStructures;

public class linear_search {

	public static int linearSearch(int[] ar, int key) {
		System.out.println("entered key: "+key);
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7,8,9,0};
		int res=linearSearch(ar,33);
		if(res==-1) {
			System.out.println("element not present in given array");
		}
		else
			System.out.println("element "+ar[res]+" is present at index: "+res);
	}
}
