import org.w3c.dom.ls.LSOutput;

public class FunctionalProgramming {
    public static void main(String[] args) {

//        a obj = new aImpl();
//        obj.show("Swajit");

        a obj2 = str -> System.out.println("a Implementation " + str);
       // a obj3 = str -> (System.out::println); ("a Implementation " + str);
        obj2.show("Samsung");
    }


}

@FunctionalInterface
interface a{
    void show(String str);
}

class aImpl implements a{
    public void show(String str){
        System.out.println("a Implementation " + str);
    }
}