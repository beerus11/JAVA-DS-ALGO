import java.util.Arrays;
class MergeSort
{
  public static void main(String[] args) {
    int array[]={9,2,5,1,7,1,2,9,5,4};
    mergeSort(array);
    for(int e : array)
    {
      System.out.println(""+e);
    }
  }

  static void mergeSort(int arr[])
  {
    if(arr.length>1)
    {
      int left[]=Arrays.copyOfRange(arr,0,(arr.length/2));
      int right[]=Arrays.copyOfRange(arr,(arr.length/2),arr.length);
      mergeSort(left);
      mergeSort(right);
      merge(arr,left,right);
    }
  }

  static void merge(int result[],int left[],int right[])
  {
    int i1=0,i2=0;
    for(int i=0;i<result.length;i++)
    {
      if(i2>right.length-1||(i1<=left.length-1 && left[i1]<right[i2]))
      {
        result[i]=left[i1++];
      }
      else{
        result[i]=right[i2++];
      }
    }
  }
}
