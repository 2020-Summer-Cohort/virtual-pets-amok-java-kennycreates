package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new OrganicDog("Riley","A reliable dog and one heck of a Ghost", 10, 15, 20, 25, 30);
    }
    /*
    pet should have hunger
    eat to decrease hunger
    have boredom
    play to lower boredom
    have a name upon creation
    should have a tick () to increase hunger and boredom
     */


    @Test
    public void shouldHaveNameOnCreation() {
        String name = underTest.getName();
        assertEquals("Riley", name);
    }

    @Test
    public void shouldHaveADefaultHunger() {
        int hunger = underTest.getHunger();
        assertEquals(20, hunger);
    }

    @Test
    public void eatShouldLowerHungerBy10() {
        int preEatingHunger = underTest.getHunger();
        underTest.eat();
        int postEatingHunger = underTest.getHunger();
        assertEquals(10, preEatingHunger - postEatingHunger);
    }

    @Test
    public void shouldHaveADefaultBoredom() {
        int boredom = underTest.getBoredom();
        assertEquals(20, boredom);
    }

    @Test
    public void playShouldLowerBoredomBy10() {
        underTest.play();
        int boredom = underTest.getBoredom();
        assertEquals(10, boredom);
    }

    @Test
    public void tickShouldIncreaseHungerBy5() {
        underTest.tick();
        int hunger = underTest.getHunger();
        assertEquals(25, hunger);

    }

    @Test
    public void tickShouldIncreaseBoredomBy5() {
        underTest.tick();
        int boredom = underTest.getBoredom();
        assertEquals(25, boredom);
    }
}
