package rocks.zipcodewilmington;

import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Crystal";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenSpeak = "meow!";

        // When (a cat's name is set to speak)
        cat.speak();

        // Then (we expect to get the given name from the dog)
        String catSpeak = cat.speak();
        Assert.assertEquals(catSpeak, givenSpeak);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
// Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        Date birthDate = new Date(1992);

        // When (a cat's birthdate is expected)
        cat.setBirthDate(birthDate);

        // Then (we expect to get the given birthday from the dog)
        Date catBirthDate = cat.setBirthDate(Date1992);
        Assert.assertEquals(catBirthDate, setBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenEat = "Kibbles";

        // When (a cat to eat is expected)
        cat.setEat(givenEat);

        // Then (we expect to get the given birthday from the dog)
        String catEat = cat.getEat();
        Assert.assertEquals(catEat, givenEat);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testCheckAnimalInheritance(){

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testCheckMammalInheritance(){

    }


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

}
