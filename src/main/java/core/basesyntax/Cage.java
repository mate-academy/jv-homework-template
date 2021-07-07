package core.basesyntax;

import java.util.Arrays;
import java.util.List;

/**
 * Feel free to remove this class and create your own.
 */
public class Cage {
    public static void printAll(List<?> list) {
        for (Object item : list)
            System.out.println(item + " ");
    }



    public static void main(String[] args) {
        Animal animal1 = new Shark("Masanya_1");
        Animal animal2 = new Pingvin("Kovalski_1");
        Animal animal3 = new Tiger("Tigrula_1");
        Animal animal4 = new Sparrow("Chijik_1");
        Mammal mammal1 = new Tiger("Tigera_2");
        Tiger tiger1 = new Tiger("Tigrula_3");
        Swimable swimable1 = new Pingvin("Kovalski_4");
        Flyable flyableable1 = new Sparrow("Chijik_4");

        List<Object> animalList = Arrays.asList(animal1, animal2, animal3, animal4,mammal1,tiger1,swimable1,flyableable1);
        System.out.println("Cage for all animals " );
        printAll(animalList);
        System.out.println("-----------------------");

        Bird bird1 = new Pingvin("Kovalski_2");
        Pingvin pingvin1 = new Pingvin("Kovalski_3");
        Sparrow sparrow1 = new Sparrow("Chijik_3");
        List<Bird>birdList = Arrays.asList(bird1,pingvin1,sparrow1);
        System.out.println("Cage for all birds");
        printAll(birdList);
        System.out.println("-----------------------");


        Fish fish1 = new Shark("Masanya_1");
        Shark shark2 = new Shark("Masanya_2");
        List<Fish>akvarium = Arrays.asList(fish1,shark2);
        System.out.println("Acvarium for all fishes");
        printAll(akvarium);
        System.out.println("-----------------------");



        for (Object o : animalList) {
            if (o instanceof Fish) {
                System.out.println(((Animal)o).getName());
                ((Animal)o).eat();
                ((Fish) o).swim();
            } else if (o instanceof Pingvin) {
                Pingvin p = (Pingvin) o;
                System.out.println(p.getName());
                p.eat();
                p.swimable();
            } else if (o instanceof Tiger) {
                Tiger t = (Tiger) o;
                System.out.println(t.getName());
                t.eat();
                t.run();
            } else if (o instanceof Sparrow) {
                Sparrow s = (Sparrow) o;
                System.out.println(s.getName());
                s.eat();
                s.flyable();
            }
            System.out.println("-----------------------");
        }
        for (Bird b : birdList) {
            if (b instanceof Pingvin) {
                Pingvin p = (Pingvin) b;
                System.out.println(p.getName());
                p.eat();
                p.swimable();
            } else if (b instanceof Sparrow) {
                Sparrow s = (Sparrow) b;
                System.out.println(s.getName());
                s.eat();
                s.flyable();
            }
            System.out.println("-----------------------");
        }
    }
}

abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    public String toString(){
        return "Animal name is - " + getName();
    }
}

abstract class Fish extends Animal {
    //protected String name;
    public Fish(String name) {
        super(name);
        this.setName(name);
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Flyable {
    //private String name;
    public Bird(String name) {
        super(name);
        this.setName(name);
    }

    //abstract void fly();
    @Override
    public void flyable() {
        System.out.println(getName() + "fly");
    }
}

abstract class Mammal extends Animal {
    //String name;
    Mammal(String name) {
        super(name);
        this.setName(name);
    }

    abstract void run();

}

interface Swimable {
    void swimable();
}

interface Flyable {
    void flyable();
}

class Shark extends Fish {
    //protected String name;
    Shark(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    protected void eat() {
        System.out.println("Shark is predator and eat fish");
    }

    @Override
    public void swim() {
        System.out.println("Shark is a great swimer");
    }
}

class Sparrow extends Bird {
    Sparrow(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    protected void eat() {
        System.out.println("Sparrow eat grain");
    }

    @Override
    public void flyable() {
        System.out.println(getName() + "Sparrow fly very well");
    }
}

class Pingvin extends Bird implements Swimable {
    //private String name;
    Pingvin(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    protected void eat() {
        System.out.println("Pinguin lubit est ribu!");
    }

    @Override
    public void swimable() {
        System.out.println("Pinguin can swim but not fly");
    }

    @Override
    public void flyable() {
        System.out.println(getName() + "Can't fly");
    }
}

class Tiger extends Mammal {
    //private String name;
    Tiger(String name) {
        super(name);
        this.setName(name);
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
