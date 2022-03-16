package management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, int NI_number, double salary, String deptName) {
        super(name, NI_number, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
