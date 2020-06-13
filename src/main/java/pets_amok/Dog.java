package pets_amok;

public abstract class Dog extends VirtualPet {


    public Dog(String name, String petDescription, int happiness, int boredom, int overallHealth, int hunger, int thirst) {
        super(name, petDescription, happiness, boredom, overallHealth, hunger, thirst);
    }



    public void walk(){
        setHappiness(getHappiness() + random.nextInt(5));
        setOverallHealth(getOverallHealth() + random.nextInt(5));
}


}
