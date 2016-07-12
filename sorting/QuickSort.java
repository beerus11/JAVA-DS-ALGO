public class QuickSort {
	public static void main(String args[]) {
		int array[]={9,2,5,1,7,1,2,9,5,4};
		quickSort(array,0,array.length-1);
		for(int e : array)
		{
			System.out.println(""+e);
		}
	}

	static void quickSort(int [] arr , int left ,int right)
	{
		if(left<right)
		{
		int p = partition(arr,left,right);
		quickSort(arr,left,p-1);
		quickSort(arr,p+1,right);
		}
	}

static int partition(int [] arr,int l, int h)
{
	int pivot=arr[h];
	int i=l-1;
	for(int j=l;j<h;j++)
	{
		if(arr[j]<=pivot)
		{
			swap(arr,i+1,j);
			i++;
		}
	}
swap(arr,i+1,h);
return i+1;
}
static void swap(int arr[] ,int i , int j)
{
	int temp= arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}

}
