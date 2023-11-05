package rocks.zipcodewilmington;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void newDogTest(){
        String expectedName = "Fido";
        Date expectedDate = null;
        Integer expectedId = 234543;
        Dog dog = new Dog(expectedName, expectedDate , expectedId);

        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void speakTest(){
        Dog dog = new Dog("Bubby", null, 486478);
        String expected = "bark!";

        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog("Charlie", null, 486478);
        Date expected = null;

        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }
}
