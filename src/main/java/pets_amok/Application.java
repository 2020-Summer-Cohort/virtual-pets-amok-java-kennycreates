package pets_amok;

import java.util.Scanner;
import java.util.List;


public class Application {


    private static String petDescription;

    private static void printPets(List<pets_amok.VirtualPet> pets) {
        for (pets_amok.VirtualPet pet : pets) {
            System.out.println(pet);
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        pets_amok.VirtualPetShelter virtualPetShelter = new pets_amok.VirtualPetShelter();
        virtualPetShelter.admit(new OrganicCat("Hobbs", "Friend of Calvin, an upright tiger with upstanding morals", 20, 10, 20,
                15, 25));
        virtualPetShelter.admit(new OrganicDog("Riley", "A reliable dog and one heck of a Ghost", 15, 20, 25, 30, 20));


        String showMenu = String.format(" Hey there, got some pets that need tending, partner..");
        System.out.println("\n Take a look at the available pets");
        System.out.println("\n Name    |Hunger             |Boredom             |Thirst             |Overall Health");
        System.out.println("___________|___________________|____________________|___________________|_________________");
        for (pets_amok.VirtualPet pet : virtualPetShelter.retrieveAllPets()) {
            if (pet instanceof pets_amok.VirtualPet) {
                System.out.println(pet.getName() + "\t" + "\t" + pet.getHunger() + "\t" + "\t" + "\t" + pet.getBoredom()
                        + "\t" + "\t" + pet.getThirst() + "\t" + "\t" + pet.getOverallHealth() + "\t" + "\t");
            }
        }

        System.out.println("\n" + "Boss, what would you like to do with the buddies?");
        System.out.println("1. Feed all the organic p" + "ets.");
        System.out.println("2. Give all the organic pets liquid courage.");
        System.out.println("3. Good call mechs need oil. don't want creaky knees.");
        System.out.println("4. Take the dog for a walk, let them get some air.");
        System.out.println("5. Ah, new pet. What is their name?");
        System.out.println("6. Let the cats out, they're anti-social anyhow.");
        System.out.println("7. Here are all the pets available for adoption.");
        System.out.println("8. Thanks for your help. Goodbye.");

        boolean runGame = true;

        while (runGame) {
            System.out.println("\nWelcome to the Pet Shelter shelter, got some pets to take care of partner.\n");
            System.out.println("\nOrganic Dogs' status'\n" +
                    "Name•Description•Boredom•Hunger•Thirst•OverallHealth•Cage State \n");
            printPets(virtualPetShelter.filterPets(pets_amok.Organic.class, pets_amok.Dog.class));
            System.out.println("\nOrganic Cats' status'\n" +
                    "Name•Description•Boredom•Hunger•Thirst•OverallHealth \n");
            printPets(virtualPetShelter.filterPets(pets_amok.Organic.class, pets_amok.Cat.class));
            System.out.println("\nRobotic Pets' status'" + "\n" +
                    "Name•Happiness•Health•Boredom•Oil Level \n");
            printPets(virtualPetShelter.filterPets(Robotic.class, null));
            openeningScroll();

            virtualPetShelter.retrieveAllPets();
            int getAction = userInput.nextInt();
            userInput.nextLine();
            if (getAction == 0) {
                System.out.println("whoa partner, be a shame if you typed in the wrong thing.");
            } else if (getAction == 1) {
                virtualPetShelter.feedAllOrganicPets();
                System.out.println("Feed all the organic pets");
            } else if (getAction == 2) {
                virtualPetShelter.waterAllOrganicPets();
                System.out.println("Give all the organic pets liquid courage");
            } else if (getAction == 3) {
                virtualPetShelter.oilAllRoboPets();
                System.out.println("good call mechs need oil. don't want creaky knees");
            } else if (getAction == 4) {
                virtualPetShelter.walkDogs();
                System.out.println("Take the dog for a walk, let them get some air");
            } else if (getAction == 5) {
                virtualPetShelter.acceptNewVirtualPet();
                System.out.println("What is the pets Name?");
                String name = userInput.nextLine();
                System.out.println("Is the pet a Dog or Cat");
                String animal = userInput.nextLine();
                System.out.println("Is the pet a Robot or is it Organic?");
                String lifeForm = userInput.nextLine();
                if (lifeForm.equalsIgnoreCase("robot") && animal.equalsIgnoreCase("cat")) {
                    RoboCat roboCat = new RoboCat(name, petDescription, 15, 20, 10, 20, 20);
                    virtualPetShelter.admit(roboCat);
                } else if (lifeForm.equalsIgnoreCase("robot") && animal.equalsIgnoreCase("dog")) {
                    RoboDog roboDog = new RoboDog(name, petDescription, 15, 20, 10, 20, 20);
                    virtualPetShelter.admit(roboDog);
                } else if (lifeForm.equalsIgnoreCase("organic") && animal.equalsIgnoreCase("cat")) {
                    OrganicCat organicCat = new OrganicCat(name, petDescription, 15, 25, 10, 5, 10);
                    virtualPetShelter.admit(organicCat);
                } else if (lifeForm.equalsIgnoreCase("organic") && animal.equalsIgnoreCase("dog")) {
                    OrganicDog organicDog = new OrganicDog(name, petDescription, 15, 10, 10, 20, 5);
                    virtualPetShelter.admit(organicDog);
                }
                System.out.println("Ah, new pets. What is their name?");
            } else if (getAction == 6) {
                virtualPetShelter.freeTheCats();
                System.out.println("Let the cats out, they're anti-social anyhow");
            } else if (getAction == 7) {
                virtualPetShelter.retrieveAdoptablesNameAndDescription();
                System.out.println("Here are all the pets available for adoption.");
            } else if (getAction == 8) {
                System.out.println("Thanks for your help. Goodbye");
                break;
            }
        }

        virtualPetShelter.tickAll();
    }




    private static void openeningScroll() {
        System.out.println("\n" + "Whoa there partner, would you like to do with the pets?");
        System.out.println("1. Feed those organic pets partner.");
        System.out.println("2. Whoa partner, be a shame if you watered robo pets. Water all the organic ones.");
        System.out.println("3. Oil and steel go together like PB & J. Oil all the robo petsters");
        System.out.println("4. Dirty cage, smelly days. Make sure you clean em all.");
        System.out.println("5. Play with a pet.");
        System.out.println("6. Adopt a pet");
        System.out.println("7. Bring a pet into the shelter.");
    }
}
