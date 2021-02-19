import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int r = sc.nextInt();

        Renter[] renter = new Renter[r];

        for (int i=0; i<renter.length; i++) {
            int zerotoone = i + 1;

            System.out.println("Rent #" + zerotoone);
            System.out.print("Name: ");
            renter[i ].setName(sc.next());
            System.out.print("Email: ");
            renter[i].setEmail(sc.next());
            System.out.print("Room: ");
            renter[i].setRoom(sc.nextInt());
        }
    }
}
