package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat(null, null, null);
        String givenName = "Garfield";

        cat.setName(givenName);

        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);

    }

    @Test
    public void speakTest(){
        Cat cat = new Cat("Jewels", null, 789549);
        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthdate(){
        Cat cat = new Cat(null, null, null);
        Date givenDate = null;

        cat.getBirthDate(givenDate);

        Date catBirthDate = cat.getBirthDate();
    }
//    String expectedName = "Gar";
//    Date expectedDate = null;
//    Integer expectedId = 4548646;
//    Cat cat = new Cat(expectedName, expectedDate, expectedId);

}
