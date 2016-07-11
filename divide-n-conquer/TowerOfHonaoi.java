import java.util.*;
class TowerOfHonaoi
{

  public static void main(String[] args) {
    System.out.println("Enter No. of discs");
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    move(no,"A","B","C");
  }

  public static void move(int n , String src, String inter, String dest)
  {
    if(n==1)
    {
        System.out.println(src+" -> "+dest);
    }else{
      move(n-1,src,dest,inter);
      System.out.println(src+" -> "+dest);
      move(n-1,inter,src,dest);
    }
  }

}
