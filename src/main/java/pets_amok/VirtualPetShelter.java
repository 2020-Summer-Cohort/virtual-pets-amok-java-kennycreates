package pets_amok;

import java.util.*;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();
    Map<String, VirtualPet> virtualPetShelter = new HashMap<>();


    public void admit(VirtualPet petToAdmit) {
        pets.put(petToAdmit.getName(), petToAdmit);
    }

    public VirtualPet getPet(String name) {
        return pets.get(name);
    }

    public Map<String, VirtualPet> adoptablePets() {
        return virtualPetShelter;
    }

    public void waterAllOrganicPets() {
        for (VirtualPet pet : adoptablePets().values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).waterAllOrganicPets();
            }
        }
    }

    public void feedAllOrganicPets() {
        for (VirtualPet pet : adoptablePets().values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).feedAllOrganicPets();
            }
        }
    }

    public void retrieveAdoptablesNameAndDescription() {
        for (VirtualPet pets : pets.values()) {
            System.out.println(pets.getName() + ":" + pets.getPetDescription());
        }
    }

    public void freeTheCats() {
        for (VirtualPet pets : pets.values()) {
            if (pets instanceof OrganicCat) {
                ((OrganicCat) pets).freeTheCats();
            }
        }
    }

    // public void adoptablePets() {
    //    for(VirtualPet pets : pets.remove()){
    //      if(pets instanceof OrganicCat, OrganicDog){
    //        ((OrganicCat)pets.adoptablePets();


    public void acceptNewVirtualPet(String name, VirtualPet newVirtualPet) {
        virtualPetShelter.put(name, newVirtualPet);
    }


    public Collection<VirtualPet> retrieveAllPets() {
        return pets.values();
    }

    public void feedAllPets() {
        for (VirtualPet petToFeed : pets.values()) {
            petToFeed.eat();
        }
    }

    public void playWith(String petName) {
        pets.get(petName).play();
    }

    public void walkDogs() {
        for (VirtualPet pet : adoptablePets().values()) {
            if (pet instanceof Dog) {
                ((Dog) pet).walk();
            }
        }
    }

    public void cleanAllCages() {
        for (VirtualPet pet : adoptablePets().values()) {
            if (pet instanceof OrganicDog) ;
            ((OrganicDog) pet).cleanOrganicCage();
        }
    }

    public void oilAllRoboPets() {
        for (VirtualPet pet : adoptablePets().values()) {
            if (pet instanceof Robotic) {
                ((RoboDog) pet).oilAllRoboPets();
            }
        }
    }

    public void acceptNewVirtualPet() {
    }

    public void admitPet() {
    }

    public void tickAll() {

    }

    public List<VirtualPet> filterPets(Class<?> animalClass, Class<?> petType) {
        List<VirtualPet> filterPets = new ArrayList<>();
        for (VirtualPet pet : filterPets) {
            if (animalClass.isInstance(pet) && petType == (null)) {
            } else if (animalClass.isInstance(pet) && petType.isInstance(pet)) {
                    filterPets.add(pet);
            }
        }
        return filterPets;
    }

}

