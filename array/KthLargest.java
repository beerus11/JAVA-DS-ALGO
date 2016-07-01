class Kthlargest
{
  public static void main(String[] args) {
    int arr[] ={4,8,3,1,7,4,2,1};
    int k=3;
    sort(arr,k);
    for(int x =arr.length-1 ; x>arr.length-k-1;x--)
    {
      System.out.println(""+arr[x]);
    }
  }

  static void sort(int arr[] , int k)
  {
    for(int i=0 ;i<k;i++)
    {
      for(int j=0;j<arr.length-1-i;j++)
      {
        if(arr[j]>arr[j+1])
        { int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }

}
