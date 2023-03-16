import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // DO NOW: Here are some objects
//        Animal animal = new Animal("some animal");
//        Cow cow = new Cow("Mr. Moo Cow");
//        Dog dog = new Dog("Fido");
//        Puppy puppy = new Puppy("Lil Rascal");

        // PREDICT which, if any, of the following will print "false"?
//        System.out.println(animal instanceof Animal); // a
//        System.out.println(cow instanceof Animal);    // b
//        System.out.println(cow instanceof Cow);       // c
//        System.out.println(dog instanceof Animal);    // d
//        System.out.println(dog instanceof Dog);       // e
//        System.out.println(puppy instanceof Animal);  // f
//        System.out.println(puppy instanceof Dog);     // g
//        System.out.println(puppy instanceof Puppy);   // h
//        System.out.println(animal instanceof Object); // i
//        System.out.println(cow instanceof Object);    // j
//        System.out.println(dog instanceof Object);    // k
//        System.out.println(puppy instanceof Object);  // l
//        System.out.println(dog instanceof Puppy);     // m

        // -----------------------   WARM UP -----------------------------
        // Exercise 1: Create an empty ArrayList of Animal objects
        // (name it whatever you want); you will need to import ArrayList.
        // then add the four objects from the Do Now (animal, cow, dog, puppy)
        // to the ArrayList, in any order, using the "add" ArrayList method.
        Animal animal2 = new Animal("some animal");
        Cow cow2 = new Cow("Mr. Moo Cow");
        Dog dog2 = new Dog("Fido");
        Puppy puppy2 = new Puppy("Lil Rascal");
        Vet amySmith = new Vet("Amy Smith");
        amySmith.addClient(animal2); // not a client yet
        amySmith.addClient(cow2);    // not a client yet
        amySmith.addClient(dog2);    // not a client yet
        amySmith.addClient(puppy2);  // not a client yet
        amySmith.addClient(animal2); // ALREADY A CLIENT
        amySmith.addClient(cow2);    // ALREADY A CLIENT
        amySmith.addClient(dog2);    // ALREADY A CLIENT
        amySmith.addClient(puppy2);  // ALREADY A CLIENT


    }
}
