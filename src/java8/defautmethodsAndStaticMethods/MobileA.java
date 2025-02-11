package java8.defautmethodsAndStaticMethods;

public class MobileA implements MobileFunctionaLities{
    private int price;
    public MobileA(int price){
        this.price = price;
    }
    @Override
    public void text() {
        System.out.println("Can text");

    }

    @Override
    public void useInternet() {
        System.out.println("Can use internet");
    }

    @Override
    public boolean isDualSim() {
        return true;
    }

    @Override
    public boolean isAndroid() {
        return true;
    }

    @Override
    public boolean is5Genabled() {
        return true;
    }

    @Override
    public void call() {
        MobileFunctionaLities.super.call();
    }
}
