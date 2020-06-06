package pets_amok;

public class OrganicDog extends Dog implements Organic{

    private int hunger;
    private int thirst;
    private int wasteLevel;

    public OrganicDog(String name, String petDescription, int happiness, int boredom, int overallHealth, int hunger, int thirst) {
        super(name, petDescription,  happiness, boredom, overallHealth, hunger, thirst) ;
        this.hunger = 20;
        this.thirst = 20;
        this.wasteLevel =15;
    }

    //public OrganicDog(String hobbs, String s) {
      //  super(Dog);
    //}

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger){this.hunger = hunger; }

    public int getThirst(){
        return thirst;
    }

   // public void setThirst(int thirst){this.thirst = thirst;    }

  //  public int getWasteLevel(){ return wasteLevel;    }

    //Public void setWasteLevel(int wasteLevel) { this.wasteLevel = wasteLevel;    }

    public void cleanOrganicCage(){
        wasteLevel = 0;
    }


    @Override
    public void feedAllOrganicPets() {
        hunger -=5;
        wasteLevel +=5;
        overallHealth +=7;
        happiness +=2;
        System.out.println("Dogs are fed, full and feeling good");

    }

    @Override
    public void waterAllOrganicPets() {
        thirst -=10;
        overallHealth +=5;
        happiness +=2;
        System.out.println("Dogs are no longer thirsty, feeling good and happy");

    }

    @Override
    public void walk(){
        wasteLevel -=10;
        happiness +=10;
        thirst += 8;
        hunger += 5;
        overallHealth +=5;
        System.out.println("Dog is happy but needs food, water & rest");
    }



    public void tick (){
        wasteLevel +=15;
        happiness -=20;
        overallHealth -=20;
        hunger +=15;
        thirst +=15;
        boredom +=15;
    }

}
