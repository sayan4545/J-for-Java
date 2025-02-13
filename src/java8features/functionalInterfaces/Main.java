package java8features.functionalInterfaces;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sayan",23,"Male",89000);
        EmployeeValidation validatEmployee= Employee::validatDetails;
        System.out.println(validatEmployee.isValidEmployee(e1));

        EmployeeValidation validateEmployee2 = (e)->{
            return (e.getId()!=0 && e.getName()!=null);
        };
        System.out.println(validateEmployee2.isValidEmployee(e1));
        Employee e3 = new Employee();
        Employee e4 = new Employee("Chandrika Dey",8,"Female",78090);
        EmployeeValidation validateEmployee3 = Employee::validatDetails;
        System.out.println(validateEmployee3.isValidEmployee(e3));

        IsEmployeeActiveFinterface isActive = e1::isEmployeeActive;
        System.out.println(isActive.isvalid(e1));

        IsEmployeeActiveFinterface activeEmployee = (e2)->e2.getSalary()!=0;
        System.out.println(activeEmployee.isvalid(e1));

        SalaryGreaterFunctionalInterface svalidSalary = Employee::isValidSalary;
        System.out.println(svalidSalary.isValidSalary(e4));

        SalaryGreaterFunctionalInterface s =(e5)->{
            return e5.getSalary()>0?true:false;
        };
        System.out.println(s.isValidSalary(e4));
    }
}
