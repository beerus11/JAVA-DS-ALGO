/**
Count total set bits in all numbers from 1 to n
**/
class CountTotalBit
{
  public static void main(String[] args) {

    System.out.println("Total Bits From 1 to 3 are:"+from1ToN(3));
    System.out.println("Total Bits From 1 to 6 are:"+from1ToN(6));
      System.out.println("Total Bits From 1 to 7 are:"+from1ToN(7));
        System.out.println("Total Bits From 1 to 8 are:"+from1ToN(8));

  }

  static int from1ToN(int no)
  {
    int count=0;
    for(int i=1;i<=no;i++)
      count+=totalBit(i);
    return count;
  }
  static int totalBit(int no)
  {
    Integer i = new Integer(no);
     char[] binary = Integer.toBinaryString(i).toCharArray();
     int count=0;
     for(char ch :binary )
     {
       if(ch=='1')
        count++;
     }
     return count;
  }
}
