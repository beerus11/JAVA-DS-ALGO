class sortBinaryArray{
  public static int[] sortArray(int [] array){
    int j=0;
    for(int i=1;i<array.length;i++){
      if(array[i]<array[j])
      {
        array[i]=1;
        array[j]=0;
        j++;
      }
    }
    return array;
  }
  public static void main(String[] args) {
    int[] bin = new int[] { 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 };
    for(int i : sortArray(bin))
      System.out.println(i);
  }
}
