package basicBrowser;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]= { 1,72,3,44,5,69};
		System.out.println("Array before swapping"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
		}
		System.out.println("Arrays after Ascending order "+Arrays.toString(a));
	
		

	}

}
