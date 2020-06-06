package pets_amok;
/* adopt a pet
admit a pet
feed all pets
play witha pet
return collection of pets
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {

    private VirtualPet testPet = new OrganicDog("Riley","A reliable dog and one heck of a Ghost", 10, 15, 20, 25, 30);
    private VirtualPetShelter underTest = new VirtualPetShelter();

    @BeforeEach
    public void setup(){
        underTest.admit(testPet);
    }

    @Test
    public void shouldBeAbleToAddPetToShelter(){

        Collection<VirtualPet> pets = underTest.retrieveAllPets();
        assertThat(pets).contains(testPet);
    }

    @Test
    public void shouldBeAbleToFeedAllShelterPets(){
        underTest.feedAllPets();
        assertEquals(18, testPet.getHunger());
    }

    @Test public void shouldPlayWithASinglePetGivenName(){
        underTest.playWith("Riley");
        assertEquals(18, testPet.getBoredom());
    }
}
