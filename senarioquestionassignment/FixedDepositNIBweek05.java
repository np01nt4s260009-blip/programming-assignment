public class FixedDepositNIBweek05 {
    public static void main(String[] args) {
        double principal = 1000.0;
        double annualRate = 0.10;
        int years = 2;
        int months = years * 12;
        double monthlyRate = annualRate / 12;
        
        double amount = principal;
        int m = 1;
        while (m <= months) {
            amount = amount * (1 + monthlyRate);
            m++;
        }
        
        double fee = amount * 0.005;
        double finalAmount = amount - fee;
        
        System.out.println("Final Recieved: Rs. " + finalAmount);
    }
}