import java.util.ArrayList;
public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel() {
        petList = new ArrayList<Pet>();
    }

    public void addPetToList(Pet a) {
        petList.add(a);
    }

    public void allSpeak() {
        for (Pet pet : petList) {
            System.out.println(pet.getName() + " " + pet.speak());
        }
    }
}
