package abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son s = new Son("ARTIST","C");
        s.career();
        System.out.println();
        s.partner();
        System.out.println(s.partnerName.toLowerCase());
    }
}
