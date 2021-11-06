package at.campus02.pacher;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private static Animal animal;

    @BeforeAll
    static void beforeAll() {
        animal = new Animal("Bella",2,"Hund","Wuff");
    }

    @Test
    @DisplayName("Animal loud")
    void giveAnimalLoud(){
        var loud = animal.giveAnimalLoud();
        assertEquals("Wuff",loud);
    }

    @Test
    @DisplayName("Animal name and age")
    void getNameAndAge(){
        var nameAndAge = animal.getNameAndAge();
        assertEquals("Bella,2",nameAndAge);
    }

    @Test
    @DisplayName("Animal category")
    void getAnimalCategory(){
        assertEquals("baby animal", animal.getAnimalCategory());
    }
}