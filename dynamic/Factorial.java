class Factorial
{
  public static void main(String[] args) {
    int n=8;
    long arr[] = new long[n+1];
    for(int i=0 ;i<n+1;i++)
      arr[i]=0L;
    System.out.println("Factorial is :: "+fact(n,arr));
  }
  static long fact(int n, long arr[])
  {
    if (n==0 || n==1)
      return 1;
    else if(arr[n]!=0)
      return arr[n];
    else
      {
        arr[n]=fact(n-1, arr)*n;
        return arr[n];
      }
  }
}
