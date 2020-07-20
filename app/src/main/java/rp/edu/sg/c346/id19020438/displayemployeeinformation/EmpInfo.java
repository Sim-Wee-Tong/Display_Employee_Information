package rp.edu.sg.c346.id19020438.displayemployeeinformation;

public class EmpInfo {

    private String name;
    private String title;
    private double salary;

    public EmpInfo(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String salaryDisplay = String.format("%.2f", salary);
        String totalDisplay = name + "(" + title + "): " + salaryDisplay;

        return totalDisplay;
//        return salaryDisplay;
    }
}
