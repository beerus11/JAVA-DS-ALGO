class LongestPalindrome
{
  public static void main(String[] args) {
    String string= "BANANA";
    int len = string.length();
    boolean matrix [][] = new boolean[len][len];
    for(int k =0 ; k<len ;k++)
    {
      matrix[k][k]=true;
    }
    for(int k =0 ; k<len-1 ;k++++)
    {
      if(String.charAt(k)==string.charAt(k+1))
        matrix[k][k+1]=true;
    }
    for(int cur_len=3;cur_len<=len;cur_len++)
    {
      for(int i=0;i<len-curr_len+1;i++)
      {
        int j = i+cur_len-1;
        if(string.charAt(i)==string.charAt(j) && matrix[i+1][j-1])

      }
    }
  }
}
