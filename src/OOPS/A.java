package OOPS;

public class A{
    String name;
    A(String name){
        this.name = name;
    }
    class B{
        int id;
        String name;
        B(String name,int id){
            this.name = name;
            this.id = id;
        }
        class C{
            String name;
            C(String name){
                this.name = name;
            }
            void printId(){
                System.out.println(id);
            }
            class D{
                String name;
                D(String name){
                    this.name = name;
                }
                void printId(){
                    System.out.println(id);
                }
            }
        }
    }

    public static void main(String[] args) {
        A obj1 = new A("Chandrika");
        A.B obj2 = obj1.new B("Sayan",78);
        A.B.C obj3 = obj2.new C("Rina");
        A.B.C.D obj4 = obj3.new D("Dey");
        System.out.println(obj1.name+" "+obj2.name+" "+obj3.name+" "+obj4.name);
        obj3.printId();
    }
    
}
