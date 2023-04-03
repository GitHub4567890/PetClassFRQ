public class Main {
    public static void main(String args[])
    {
        Cat c = new Cat("Fluffy");
        Dog d = new Dog("Rex");
        LoudDog ld = new LoudDog("Bowser");

        Kennel k = new Kennel();
        k.addPetToList(c);
        k.addPetToList(d);
        k.addPetToList(ld);
        k.allSpeak();
    }

}
