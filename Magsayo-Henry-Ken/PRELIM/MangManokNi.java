import java.util.Scanner;

public class MangManokNi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Location = 0, Qty = 0, i = 0;
        char Currency = ' ';
        double[] OrderPrice = new double[4];
        String[] OrderName = {"ChiliChicken", "RegChicken", "HaloX2", "Drinks"};

        while (Location < 1 || Location > 3) {
            System.out.println("Which country are you in:\n\n1.) Philippines\n2.) USA\n3.) Japan\n-------------------");
            Location = sc.nextInt();

            switch (Location) {
                case 1:
                    OrderPrice[0] = 175;
                    OrderPrice[1] = 150;
                    OrderPrice[2] = 69;
                    OrderPrice[3] = 30;
                    Currency = 'P';
                    break;
                case 2:
                    OrderPrice[0] = 175 / 56.0;
                    OrderPrice[1] = 150 / 56.0;
                    OrderPrice[2] = 69 / 56.0;
                    OrderPrice[3] = 30 / 56.0;
                    Currency = '$';
                    break;
                case 3:
                    OrderPrice[0] = 175 / 13.0;
                    OrderPrice[1] = 150 / 13.0;
                    OrderPrice[2] = 69 / 13.0;
                    OrderPrice[3] = 30 / 13.0;
                    Currency = 'Y';
                    break;
                default:
                    System.out.println("\n\n======Invalid Location======\n");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    break;
            }
        }

        while (i != OrderName.length){
            System.out.println("How many " + OrderName[i] + " you would like to buy: ");
            Qty = sc.nextInt();
            OrderPrice[i] = OrderPrice[i] * Qty;
            Qty = 0;
            i++;
        }
        
        i = 0;
        while (i != OrderName.length){
            System.out.println("Your total price on " + OrderName[i] + " is: " + Currency + String.format("%.2f", OrderPrice[i]));
            i++;
        }
    }
}
