package java8features.functionalInterfaces;

public class Employee {
    private String name;
    private int id;
    private String gender;
    private double salary;

    public Employee(String name, int id, String gender, double salary) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    static boolean validatDetails(Employee employee){
        if(employee.getId()!=0 && employee.getName()!=null){
            return true;
        }
        return false;
    }
    boolean isEmployeeActive(Employee employee){
        return employee.getSalary()!=0;
    }
    void printEmployeeWithSalaryGretaerThan10000(){
        if(this.getSalary()>10000){
            System.out.println("Salary is greater than 10000" + this);
        }else{
            System.out.println("Salary is not ghreater than 10000"+ this);
        }
    }
    boolean isValidSalary(){
        return this.getSalary()>0?true:false;
    }
}
