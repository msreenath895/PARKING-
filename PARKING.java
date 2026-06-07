import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        String[][] parking = new String[5][3];
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Park Vehicle\n2. Exit Vehicle\n3. Quit");
            int choice = sc.nextInt();
            
            if (choice == 3) break;
            
            if (choice == 1) {
                System.out.println("Enter last 4 digits of vehicle number:");
                String carNum = sc.next();
                boolean parked = false;
                
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (parking[i][j] == null) {
                            parking[i][j] = carNum;
                            System.out.println("Parked at Lane " + (i + 1) + " Slot " + (j + 1));
                            parked = true;
                            break;
                        }
                    }
                    if (parked) break;
                }
                if (!parked) {
                    System.out.println("Parking Full");
                }
            } else if (choice == 2) {
                System.out.println("Enter last 4 digits of vehicle number:");
                String carNum = sc.next();
                boolean found = false;
                
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (carNum.equals(parking[i][j])) {
                            parking[i][j] = null;
                            System.out.println("Vehicle Exited from Lane " + (i + 1) + " Slot " + (j + 1));
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (!found) {
                    System.out.println("Car Not Found in the Parking");
                }
            }
        }
        sc.close();
    }
}