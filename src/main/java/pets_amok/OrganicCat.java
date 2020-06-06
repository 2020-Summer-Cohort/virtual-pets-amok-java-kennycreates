package pets_amok;



public class OrganicCat extends Cat implements Organic {

    private int hunger;
    private int thirst;
    private int freeRoam;


    public OrganicCat(String name, String petDescription, int happiness, int boredom, int overallHealth, int hunger, int thirst) {
        super(name, petDescription, happiness, boredom, overallHealth, hunger, thirst);
        this.hunger = 20;
        this.thirst = 20;
    }

    // cat super called why?
   // public OrganicCat(String hobbs, String s) {
     //   super(Cat);
    //}
/*
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public void setThirst(int thirst){
        this.thirst = thirst;
    }
*/
    public void setFreeTheCats(int freeTheCats){
        hunger +=10;
        thirst +=10;
        happiness +=5;
    }

    @Override
    public void feedAllOrganicPets() {
        hunger -=5;
        overallHealth +=7;
        happiness +=2;

    }

    @Override
    public void waterAllOrganicPets() {
        thirst -=10;

    }


    public void freeTheCats(){
        happiness += 10;
        thirst +=10;
        happiness +=5;
    }

}
