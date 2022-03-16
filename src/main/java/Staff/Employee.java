package Staff;

public abstract class Employee {

    private String name;
    private int NI_number;
    private double salary;

    public Employee(String name, int NI_number, double salary) {
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public int getNI_number() {
        return NI_number;
    }

    public void setNI_number(int NI_number) {
        this.NI_number = NI_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salaryRaise(double amount) {
        if(amount > 0) {
            return this.salary += amount;
        }else{
            return this.salary;
        }
    }

    public double payBonus() {
        return  this.salary / 100;
    }

//    public int BonusPay() {
//        return (int) (this.salary + getBonus());
//    }

}
