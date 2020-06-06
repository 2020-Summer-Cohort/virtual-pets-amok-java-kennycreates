package pets_amok;

public abstract class Cat extends VirtualPet{

    public Cat(String name, String petDescription, int happiness, int boredom, int overallHealth, int hunger, int thirst) {
        super(name, petDescription, happiness, boredom, overallHealth, hunger, thirst);
    }


public void freeRoam(){
        setHappiness(getHappiness() + random.nextInt(4));
    }

}
