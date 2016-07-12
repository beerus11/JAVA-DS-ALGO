class CountingSort
{
  public static void main(String[] args) {
    char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
    sort(arr);
    System.out.print("Sorted character array is ");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]);
  }
  static void sort(char arr[])
  {
    int n = arr.length;
    int count[] = new int[256];
    for (int i=0; i<256; ++i)
        count[i] = 0;
    for (int i=0; i<n; ++i)
        ++count[arr[i]];
    for (int i = 0,j=0; i<n;j++)
      {  while(count[j]>0)
         {
           arr[i] = (char)j;
           --count[j];
           i++;
         }
      }
  }

}
