class Patient {
    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;
    
    Patient(String p, int a, int d, double dc) {
        patientName = p;
        age = a;
        daysAdmitted = d;
        dailyCharge = dc;
    }
    
    double CalculateTotalBill() {
        double acbill;
        double bill;
        bill = 0;
        acbill = daysAdmitted * dailyCharge;
        if(daysAdmitted>7){
            bill = acbill - acbill * 0.1;
        } else {
            bill = acbill;
        }
        System.out.println("You stayed for: " + daysAdmitted);
        System.out.println("Your daily charge was:  " + dailyCharge);
        System.out.println("Your bill is : " + bill);
        return bill;
        }
        
      void description() {
          System.out.println("Name: " + patientName);
          System.out.println("Age: " + age);
          System.out.println("Days Admitted: " + daysAdmitted);
          System.out.println("Daily charge: " + dailyCharge);
      }
    }
    
    
    public class HospitalTestsweek08 {
        public static void main(String[] args) {
            Patient a = new Patient("Emily",20,4,700.0);
            Patient b = new Patient("sylvie",20,8,700.0);
            a.description();
            a.CalculateTotalBill();
            b.description();
            b.CalculateTotalBill();
        }
    }