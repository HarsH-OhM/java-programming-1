package Assignment1;

import java.util.ArrayList;

class Employee{
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getId() {
        return empId;
    }

    public void setId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return empName;
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return empDesignation;
    }

    public void setDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getSalary() {
        return empSalary;
    }

    public void setSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getLocation() {
        return empLocation;
    }

    public void setLocation(String empLocation) {
        this.empLocation = empLocation;
    }


    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}

public class Emp {
	
    public static void main(String[] args) {

        ArrayList<Employee> empinfo = new ArrayList<>();
        empinfo.add(new Employee(1,"Harsh Malviya","CTO",10000,"Morrco"));
        empinfo.add(new Employee(2,"Akash Kumar","Ethics Manager",23000,"modaltown"));
        empinfo.add(new Employee(3,"Medha Mupalla","SPA",456000,"gulabra"));
        empinfo.add(new Employee(4,"Pravin sahu","HR",155000,"solang"));
        empinfo.add(new Employee(5,"Vikash rana","DIN",145000,"pandrom"));
        empinfo.add(new Employee(6,"Mukesh jain","juniar Software DEveloper",33000,"generio"));
        empinfo.add(new Employee(7,"Yashwant Sharma","Finace Manager",45000,"bigoh"));
        empinfo.add(new Employee(8,"Hardik pandeya","HR",50000,"trapher"));
        empinfo.add(new Employee(9,"Virat kohli","Product Manager",90000,"strphn"));
        empinfo.add(new Employee(10,"crystopher hunt","Creative Director",78000,"harda"));

        System.out.println(" Employees Name: \n");
        empinfo.stream().forEach(e->System.out.println(e.getName()));

        System.out.println("\n  salaries greater than 50,000: \n");
        empinfo.stream().filter(e->e.getSalary()>50000).forEach(e->System.out.println("Name : " + e.getName() + " , Salary : " + e.getSalary()));

        System.out.println("\n locations starting with letter \'M\' : \n");
        empinfo.stream().filter(e->e.getLocation().startsWith("M")).forEach(e->System.out.println("Name : " + e.getName() + " , Location : " + e.getLocation()));

        System.out.println("\n  designations ending with \'E\'");
        empinfo.stream().filter(e->e.getDesignation().endsWith("e")).forEach(e-> System.out.println("Name : " + e.getName() + " , Designation : " + e.getDesignation()));

    }
}