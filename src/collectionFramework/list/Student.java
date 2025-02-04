package collectionFramework.list;

public class Student {
    private String name;
    private double gpa;
    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public String getName(){
        return  this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public String toString(){
        return this.getName()+ " "+ this.getGpa() ;
    }
}
