package pets_amok;

public class RoboCat extends Cat implements Robotic {

    public RoboCat(String name, String petDescription, int happiness, int boredom, int overallHealth, int hunger, int thirst) {
        super(name, petDescription, happiness, boredom, overallHealth, hunger, thirst);
    }


    @Override
    public void oilAllRoboPets() {

    }
}

