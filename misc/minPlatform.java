/**
Find minimum number of platforms needed in the station so to avoid any delay in arrival of any train
**/
import java.util.*;
class minPlatform{

public static int minPlatform(float [] arr , float[] dep){
  ArrayList<Float> platforms= new ArrayList<Float>();
  int total=0;
  for(int i=0 ; i<arr.length;i++){
    boolean avail=false;
    for(int j=0;j<platforms.size();j++){
      if(arr[i]>platforms.get(j))
      {
        platforms.add(i,dep[i]);
        avail=true;
        break;
      }
    }
    if(!avail)
    {
      total++;
      platforms.add(dep[i]);
    }
  }
  return total;
}
  public static void main(String[] args) {
    float [] arrival = {2.00f,2.10f, 3.00f, 3.20f, 3.50f, 5.00f };
    float [] departure ={ 2.30f, 3.40f, 3.20f, 4.30f, 4.00f, 5.20f };
    System.out.println(minPlatform(arrival,departure));
  }
}
