package java8.defautmethodsAndStaticMethods;

public class ClassTwo implements I2,I3{

    @Override
    public void m1() {
        I3.super.m1();
    }

}
