import java.util.Scanner;
public class RikshawFareweek03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter distance (km): ");
        double distance = sc.nextDouble();
        
        System.out.println("Enter time (minutes): ");
        int time = sc.nextInt();
        
        System.out.println("Is the costumer local? (true/false): " );
        boolean isLocal = sc.nextBoolean();
        
        System.out.println("Is the travel at night? (true/false) : ");
        boolean isNight = sc.nextBoolean();
        
        double basefare =  40.0;
        double Kmcharge = distance * 15.0;
        double timecharge= time * 3.0;
        
        double total = basefare +Kmcharge +timecharge;
        
        total = (isLocal && distance > 10) ? total * 0.8 : total;
        
        total = (isNight) ? total * 1.4 : total;
        
        
        System.out.println("distance: " + distance + " km");
        System.out.println("Total fare: " + (int)total);
        sc.close();
    }
}