package abstractClasses;

public class Son extends Parent{
    String careerName;
    String partnerName ;
    Son(String careerName,String partnerName){
        this.careerName= careerName;
        this.partnerName = partnerName;
    }
    @Override
    void career(){
        System.out.println("My careerChoice is : "+ careerName);
    }

    @Override
    void partner() {
        System.out.println("My partnerName is : " + partnerName);

    }
}
