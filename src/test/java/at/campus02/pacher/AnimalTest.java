package at.campus02.pacher;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private static Animal animal1, animal2, animal3;


    @BeforeAll
    static void beforeAll() {

        animal1 = new Animal("Bella",1,"Hund","Wuff");
        animal2 = new Animal("Kitty",5,"Katze","Miau");
        animal3 = new Animal("Lion",3,"Löwe","Roarr");
    }

    @Test
    @DisplayName("Animal loud")
    void giveAnimalLoud(){
        assertEquals("Wuff",animal1.giveAnimalLoud());
        assertEquals("Miau",animal2.giveAnimalLoud());
        assertEquals("Roarr",animal3.giveAnimalLoud());
    }

    @Test
    @DisplayName("Animal name and age")
    void getNameAndAge(){
        assertEquals("Bella,1",animal1.getNameAndAge());
        assertEquals("Kitty,5",animal2.getNameAndAge());
        assertEquals("Lion,3",animal3.getNameAndAge());
    }

    @Test
    @DisplayName("Animal category")
    void getAnimalCategory(){
        assertEquals("baby animal", animal1.getAnimalCategory());
        assertEquals("old animal", animal2.getAnimalCategory());
        assertEquals("young animal", animal3.getAnimalCategory());
    }
}