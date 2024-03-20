package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat() {
 Cat cat = new Cat(null,null,null);

        int initialSize = CatHouse.getNumberOfCats();
        CatHouse.add(cat);
        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize +1);
        CatHouse.clear();
}
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){
Cat cat = new Cat(null,null,null);
        int expected = 89456;
        CatHouse.remove(cat);
        int initialSize = CatHouse.getNumberOfCats();
        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize);
        CatHouse.clear();
    }
            // TODO - Create tests for `void remove(Cat cat)`
            @Test
            public void testRemoveCat() {
        Cat cat = new Cat (null,null,null);
        CatHouse.add(cat);
        int initialSize = CatHouse.getNumberOfCats();
        CatHouse.remove(cat);
        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize -1);
        CatHouse.clear();
            }
                // TODO - Create tests for `Cat getCatById(Integer id)`
                @Test
                public void testGetCatById() {
                    //Given
                    Cat cat = new Cat("mittens", null, 5674);
                    Cat expectedId = cat;
                    //When
                    CatHouse.add(cat);
                    Cat actualId = CatHouse.getCatById(5674);

                    //Then
                    Assert.assertEquals(expectedId, actualId);
                    CatHouse.clear();
                }
                    // TODO - Create tests for `Integer getNumberOfCats()`
                    @Test
                    public void testGetNumberOfCats() {
        Cat cat = new Cat(null,null,null);
        CatHouse.add(cat);
        CatHouse.getNumberOfCats();
        int initialSize = CatHouse.getNumberOfCats();
        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize );

                    }
                }

