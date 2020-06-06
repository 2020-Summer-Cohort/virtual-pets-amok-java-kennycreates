package pets_amok;

import java.util.Random;

public abstract class VirtualPet {
    public String name;
    public String petDescription;
    public int happiness;
    public int boredom;
    public int hunger;
    public int thirst;
    public int overallHealth;

    Random random = new Random();

    public VirtualPet(String name, String petDescription, int happiness, int boredom, int overallHealth, int hunger, int thirst) {
        this.name = name;
        this.petDescription = petDescription;
        this.happiness = happiness;
        this.boredom = boredom;
        this.hunger = hunger;
        this.thirst =thirst;
        this.overallHealth = overallHealth;
    }

    public String getName() {
        return name;
    }

    public String getPetDescription() { return petDescription; }

    //public void setDescription(String petDescription) {
       // this.petDescription = petDescription;  }

    public int getHunger() { return happiness; }

    public int getThirst() { return thirst; }

    public int getBoredom() { return boredom; }

    public int getHappiness() { return happiness; }

    public int getOverallHealth() { return overallHealth; }

    public void setHappiness(int happiness) {
        this.happiness = happiness; }

        public void setOverallHealth(int overallHealth){
        this.overallHealth = overallHealth;
        }


    public void eat() {
    }

    public void play() {
        happiness += random.nextInt(10);
        boredom += random.nextInt(4);
        hunger += random.nextInt(7);
        thirst += random.nextInt(6);
    }

    public void tick() {
        happiness +=5;
        boredom +=5;
        hunger -=10;
        thirst +=12;
        overallHealth -=5;
    }


}
