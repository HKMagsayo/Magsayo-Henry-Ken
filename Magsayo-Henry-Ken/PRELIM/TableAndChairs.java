public class TableAndChairs {
  public static void main(String [] args){
    char P = '#', A = ' ';
    int i = 0;
    
    while(i != 6){
      for(int a = 0; a != 25; a++){
        if((i >= 4 && (a == 5 || a == 19)) || (i >= 3 && (a == 8 || a == 16)) || a == 0 || a == 24 || (i == 3 && a < 6) || (i == 3 && a > 18) || (i == 2 && a >= 8 && a <= 16)){
           System.out.print(P);
           try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
          }
        }
        else{
           System.out.print(A);
           try {
            Thread.sleep(75);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
          }
        }
      }
      System.out.print("\n");
      i++;
    }
  }
}