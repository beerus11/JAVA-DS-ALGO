class SquareRoot
{
  public static void main(String[] args) {
    System.out.println("Floor root of 4 is "+floorRoot(16));
  }

  static int  floorRoot(int x)
  {
    if(x==0||x==1)
    return x;
    int result=1;int i=1;
    while(result<=x)
    {
      i++;
      result=i*i;
    }
    return i-1;
  }
}
