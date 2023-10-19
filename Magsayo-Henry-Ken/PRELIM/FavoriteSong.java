public class FavoriteSong {
  public static void main(String [] args){
    String [] Lyrics = {"I got a heart,","and I got a soul","Believe me, I will use them both","We made a start","Be it a false one, I know","Baby, I don't want to feel alone"};
    int a = 0, i = 0;
    
    try{
    while(a != Lyrics.length){
      if(i == 2 || i == 5){
         System.out.println(Lyrics[i]);
         Thread.sleep(5500);
      }
      else{
         System.out.println(Lyrics[i]);
         Thread.sleep(4000);
      }
      a++;
      i++;
    }
    }
    catch (InterruptedException e){
      System.out.println(e);
    }
  }
}