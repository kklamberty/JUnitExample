import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListBagTest {

    /* Since this bag of items will be used for several tests,
    we want to declare it outside of any particular test */
    private bagDataStructure<Item> bigBag2;

    /* Creating the objects from the user defined data type*/
    private static Item item1;
    private static Item pizza;
    private static Item lasagna;
    private static Item chicken;
    private static Item burrito;
    private static Item noodles;
    private static Item donut;
    private static Item cheetos;

    @BeforeAll
    static void setUp() {
        item1 = new Item("Tv", 20000);
        pizza = new Item("pizza", 500);
        lasagna = new Item("lasagna", 900);
        chicken = new Item("chicken", 500);
        burrito = new Item("burrito", 200);
        noodles = new Item("noodles", 300);
        donut = new Item("donut", 100);
        cheetos = new Item("cheetos", 150);
    }

    @BeforeEach
    void setUpEach() {
        /* Here, we give bigBag2 its initial value -
        it's a LinkedListBag of things of type Item */
        bigBag2 = new LinkedListBag<>();

        /* Add objects from the user defined type to the list*/
        bigBag2.add(item1);
        bigBag2.add(pizza);
        bigBag2.add(lasagna);
        bigBag2.add(chicken);
        bigBag2.add(burrito);
        bigBag2.add(noodles);
        bigBag2.add(donut);
        bigBag2.add(cheetos);
    }

    @Test
    @DisplayName("Bags with items are not empty")
    void testEmpty() {
        assertFalse(bigBag2.isEmpty());
    }

    @Test
    @DisplayName("Bag has 8 items")
    void testGetCurrentSize() {
        assertEquals(8, bigBag2.getCurrentSize());
    }

    @Test
    @DisplayName("Contains specific item (pizza)")
    void testContains() {
        assertTrue(bigBag2.contains(pizza));
    }

    @Test
    @DisplayName("Count instances of a thing - 1 burrito")
    void testGetFrequency() {
        assertEquals(1, bigBag2.getFrequencyOf(burrito));
    }

    @Test
    @DisplayName("Remove random thing")
    void testRemoveRandom() {
        assertEquals(8, bigBag2.getCurrentSize());
        bigBag2.removeRandom();
        assertEquals(7, bigBag2.getCurrentSize());
    }

    @Test
    @DisplayName("Remove specific thing")
    void testRemoveSpecific() {
        assertTrue(bigBag2.contains(item1));
        assertEquals(8, bigBag2.getCurrentSize());
        assertTrue(bigBag2.removeSpecific(item1));
        assertFalse(bigBag2.contains(item1));
        assertEquals(7, bigBag2.getCurrentSize());
    }

    @Test
    @DisplayName("Clear all")
    void testClearAll() {
        assertEquals(8, bigBag2.getCurrentSize());
        bigBag2.clear();
        assertEquals(0, bigBag2.getCurrentSize());
    }

    @Test
    @DisplayName("Add item to bag")
    void testAdd() {
        bigBag2.clear();
        Item egg = new Item("eggs", 189);
        bigBag2.add(egg);
        assertTrue(bigBag2.contains(egg));
        assertEquals(1, bigBag2.getCurrentSize());
    }
}

