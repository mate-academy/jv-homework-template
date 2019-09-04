package core.basesyntax;

import java.util.ArrayList;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    public static void main(String[] args) {
        Zoo a1 = new Shark("Masanya_1");
        Zoo a2 = new Pingvin("Kovalski_1");
        Zoo a3 = new Tiger("Tigrula_1");
        Zoo a4 = new Sparrow("Chijik_1");

        Fish f1 = new Shark("Masanya_2");
        Bird b1 = new Pingvin("Kovalski_2");
        Mammal m1 = new Tiger("Tigera_2");
        Shark mas1 = new Shark("Masanya_2");
        Pingvin p1 = new Pingvin("Kovalski_3");
        Tiger l1 = new Tiger("Tigrula_3");
        Sparrow s1 = new Sparrow("Chijik_3");
        Swimable sw1 = new Pingvin("Kovalski_4");
        Flyableable s2 = new Sparrow("Chijik_4");
        ArrayList<Zoo> array1 = new ArrayList<>();//All animal
        array1.add(a1);
        array1.add(a2);
        array1.add(a3);
        array1.add(a4);
        ArrayList<Fish> array2 = new ArrayList<>();//Acvarium
        array2.add(f1);
        array2.add(mas1);
        ArrayList<Bird> array3 = new ArrayList<>();//Birdcage
        array3.add(s1);
        array3.add(b1);
        array3.add(p1);

       // ancage.addAll(ancage);
        //Zoo[] array1 = {a1, a2, a3,a4, f1, b1, m1, mas1, p1, l1};
        //Flyableable[] array2 = { s1,s2, b1, m1, p1, l1};

        for (Zoo a : array1) {
            if (a instanceof Shark) {
                Shark m = (Shark) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.swimable();
            } else if (a instanceof Tiger) {
                Tiger t = (Tiger) a;
                System.out.println(t.name);
                t.eat();
                t.run();
            }else if (a instanceof Sparrow){
                Sparrow s = (Sparrow)a;
                System.out.println(s.name);
                s.eat();
                s.flyable();
            }
            System.out.println("-----------------------");
        }
        for (Bird b : array3) {
            if (b instanceof Pingvin) {
                Pingvin p = (Pingvin) b;
                System.out.println(p.name);
                p.eat();
                p.swimable();
            } else if (b instanceof Sparrow) {
                Sparrow s = (Sparrow) b;
                System.out.println(s.name);
                s.eat();
                s.flyable();
            }
            System.out.println("-----------------------");
        }
    }
}
abstract class Zoo {
    String name;
    Zoo(String name){
        this.name = name;
    }

    abstract void eat();

}

abstract class Fish extends Zoo {
    //protected String name;
    public  Fish(String name){
        super (name);
        this.name = name;
    }

    abstract void swim();
}

abstract class  Bird extends Zoo implements Flyableable {
    //private String name;
    public Bird(String name){
        super(name);
        this.name = name;
    }
    //abstract void fly();
    @Override
    public void flyable (){
        System.out.println(name + "fly");
    }
}

abstract  class Mammal extends Zoo implements Flyableable {
    //String name;
    Mammal (String name){
        super(name);
        this.name =name;
    }
    abstract  void run();

}
interface Swimable{
    void swimable();
}
interface Flyableable{
    default void flyable(){
        System.out.println("Somebody flyable");
    }
}

class Shark extends Fish {
    //protected String name;
    Shark(String name){
        super(name);
        this.name = name;
    }

    @Override
    protected void eat() {
        System.out.println("Shark is predator and eat fish");
    }
    @Override
    public void swim (){
        System.out.println("Shark is a great swimer");
    }
}
class Sparrow extends Bird{
    Sparrow(String name){
        super(name);
        this.name = name;
    }
    @Override
    protected void eat() {
        System.out.println("Sparrow eat grain");
    }
    @Override
    public void flyable (){
        System.out.println(name + "Sparrow fly very well");
    }
}
class Pingvin extends Bird implements Swimable {
    //private String name;
    Pingvin(String name){
        super(name);
        this.name = name;
    }

    @Override
    protected void eat() {
        System.out.println("Pinguin lubit est ribu!");
    }

    @Override
    public void swimable() {
        System.out.println("Pinguin can swim but not fly");
    }
}

class Tiger extends Mammal {
    //private String name;
    Tiger(String name){
        super(name);
        this.name = name;
    }

    @Override
    protected void eat() {
        System.out.println("Tiger like meet");
    }

    @Override
    void run() {
        System.out.println("Tiger - can run!");
    }
}