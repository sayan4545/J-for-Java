package maps;

import java.util.*;
class Employee{
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    public Employee() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return false;
        if(obj == null) return  false;
        if(this.getClass()!=obj.getClass()) return  false;
        Employee e1 = (Employee) obj;
        if((id==e1.id) && Objects.equals(name,e1.name)){
            return  true;
        }
        else{
            return false;
        }
    }
}
public class HashMapimpl {
    public static void main(String[] args) {
//        HashMap<Integer,String> m1 = new HashMap<>();
//        m1.put(1,"Sayan");
//        m1.put(2,"kaushik");
//        m1.put(3,"Chandrika");
//        String student1 = m1.get(2);
//        System.out.println(student1);
//        System.out.println(m1.containsKey(2));
//        System.out.println(m1);
//        HashMap<Integer, ArrayList<String>> m2 = new HashMap<>();
//        m2.put(1,new ArrayList<>(Arrays.asList("Eggs","bananna","Coke")));
//        m2.put(2,new ArrayList<>(10));
//        System.out.println(m2);
//        Set<Integer> keys = m1.keySet();
//        for(int i: keys){
//            System.out.println(m1.get(i));
        //}
//        HashMap<Integer,String> m1 = new HashMap<>();
//        m1.put(1,"Sayan");
//        m1.put(2,"Chandrika");
//        m1.put(3,"rakshit");
//        m1.put(4,"Arpan");
//
//        Set<Integer> keys = m1.keySet();
//        Set<Map.Entry<Integer,String>> entries = m1.entrySet();
//        for(Map.Entry<Integer,String> entry: entries){
//            System.out.println(entry.getKey()+": "+entry.getValue());
//        }
//        for(int i: keys){
//            System.out.println(m1.get(i));
//        }
//        for(Map.Entry<Integer,String> entry: entries){
//            entry.setValue(entry.getValue().toUpperCase());
//        }
//        System.out.println(m1);
//        for(Map.Entry<Integer,String> entry:m1.entrySet()){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }
        Employee e1 = new Employee("Rahul",67);
        Employee e2 = new Employee("Sayan",90);
        Employee e3 = new Employee("Chandrika",89);
        Employee e4 = new Employee("Rahul",67);
        HashMap<Employee,String> map = new HashMap<>();
        map.put(e1, "Engineer");
        map.put(e2,"Docctor");
        map.put(e3,"Partisan");
        map.put(e4,"Dancer");
        System.out.println(map);
        System.out.println(map.size());
        HashMap<String,Integer> map3 = new HashMap<>(10,1.5f);
        map3.put("Sayan",100);
        map3.put("Chandrika",100);
        map3.put("Rajdeep",45);
        System.out.println(map3.getOrDefault("Sayan",98));
        System.out.println(map3.putIfAbsent("Agastya",99));
        for(Map.Entry<String,Integer> entries : map3.entrySet()){
            System.out.println(entries);
        }

    }
}
