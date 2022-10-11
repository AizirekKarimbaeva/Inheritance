import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Bill Gates","Microsoft");
        Dancer dancer1 = new Dancer("Bubusara Beishanalieva","Kyrgyz ballet");
       Singer singer1 = new Singer("Dimash Kudaibergen","Dimash");
        System.out.println(programmer1);
        System.out.println(dancer1);
        System.out.println(singer1);
        programmer1.coding();
        System.out.println(dancer1.dancing());
        System.out.println(singer1.singing());
        singer1.playGitar();
        System.out.println();
        programmer1.learn();
        programmer1.walk();
        programmer1.eat();
        System.out.println();
        dancer1.learn();
        dancer1.walk();
        dancer1.eat();
        System.out.println();
        singer1.learn();
        singer1.walk();
        singer1.eat();


    }
}