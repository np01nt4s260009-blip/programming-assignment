class Person {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "Informatics College";
    
    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    
    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
    }

    
class Teacher extends Person {
    String subject;
    double bonus;
    
    public Teacher(int id, String name, double basicSalary, String subject, double bonus) {
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus  = bonus;
    }
    
    @Override
    public double calculateAnnualSalary() {
        
        return super.calculateAnnualSalary() + bonus;
    }
}

class Staff extends Person {
    int workingHours;
    double ratePerHour;
    
    
    public Staff(int id, String name, double basicSalary, int workingHours, double ratePerHour) {
        super(id,name,basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    
    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
    }
    
    
public class SchoolApp {
    public static void main(String[] args) {
        System.out.println("College: " + Person.collegeName);
        
        Teacher t = new Teacher(101, "sylvie", 50000, "javaprogramming", 20000);
        Staff s = new Staff(201, "Emily", 30000, 160, 500);
        
        System.out.println("Teacher Annual Salary (with bonus): " + t.calculateAnnualSalary());
        System.out.println("Staff Monthly Salary: " + s.calculateSalary());
        
    }
}
