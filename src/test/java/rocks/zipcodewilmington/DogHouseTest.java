package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){
        Dog dog = new Dog(null,null,null);
        DogHouse.add(dog);
        int initialSize = DogHouse.getNumberOfDogs();
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize);
        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){
        Dog dog = new Dog(null,null,null);
        DogHouse.remove(dog);
        int initialSize = DogHouse.getNumberOfDogs();
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize);
        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog(){
        Dog dog = new Dog(null,null,null);
        DogHouse.add(dog);
        int initialSize = DogHouse.getNumberOfDogs();
        DogHouse.remove(dog);
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize -1);
        DogHouse.clear();
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        Dog dog = new Dog(null,null,null);
        DogHouse.getDogById(8347484);
        int initialSize = DogHouse.getNumberOfDogs();
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize);
        DogHouse.clear();
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
 //   @Test
    //    public void testGetNumberOfDogs(){
    //
    //    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
