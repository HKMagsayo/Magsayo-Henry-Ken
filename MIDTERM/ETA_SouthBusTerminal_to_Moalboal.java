import java.util.Scanner;

public class ETA_SouthBusTerminal_to_Moalboal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Speed = 0, MSpeed = 0, hrs;
        int hr = 0;
        String blocked = " ";

        System.out.print("What is your Travel Speed(Km/h): ");
        Speed = sc.nextDouble();
        System.out.print("Is Barili blocked: ");
        blocked = sc.next();

        if (blocked.equalsIgnoreCase("yes")) {
            System.out.print("Is Dumanjug blocked: ");
            blocked = sc.next();
            if (blocked.equalsIgnoreCase("yes")) {
                hrs = 108 / Speed;
                hr = (int) hrs;
                MSpeed = (108 / Speed - hr) * 60;

                System.out.println("\nOutput:\nRecommended Route: 4.2-5\n!South Bus Terminal\n\n1.Mingla\n2.San Frernando\n3.Carcar\n4.2.Sibonga\n5.Argao\n5.1.Ronda\n5.2.Alcantara\n\nSpeed: "
                        + Speed + "Km/h\nDistance: 108Km\nDestination: ---Moalboal---\nETA: " + hr + " Hour/s and " + MSpeed + " Minutes");
            } else {
                hrs = 98 / Speed;
                hr = (int) hrs;
                MSpeed = (98 / Speed - hr) * 60;

                System.out.println("\nOutput:\nRecommended Route: 4.2\n!South Bus Terminal\n\n1.Mingla\n2.San Frernando\n3.Carcar\n4.2.Sibonga\n4.2.1.Domanjug\n4.2.2.Alcantara\n\nSpeed: "
                        + Speed + "Km/h\nDistance: 98Km\nDestination: ---Moalboal---\nETA: " + hr + " Hour/s and " + MSpeed + " Minutes");
            }
        } else {
            hrs = 85.5 / Speed;
            hr = (int) hrs;
            MSpeed = (85.5 / Speed - hr) * 60;

            System.out.println("\nOutput:\nRecommended Route: 4.1\n!South Bus Terminal\n\n1.Mingla\n2.San Frernando\n3.Carcar\n4.1.Barili\n4.1.1.Domanjug\n4.1.2.Alcantara\n\nSpeed: "
                    + Speed + "Km/h\nDistance: 85.5Km\nDestination: ---Moalboal---\nETA: " + hr + " Hour/s and " + MSpeed + " Minutes");
        }
    }
}