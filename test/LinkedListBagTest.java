import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListBagTest {

    /* Since this bag of items will be used for several tests,
    we want to declare it outside of any particular test */
    private static bagDataStructure<Item> bigBag2;

    @BeforeAll
    static void setUp(){
        /* Here, we give bigBag2 its initial value -
        it's a LinkedListBag of things of type Item */
        bigBag2 = new LinkedListBag<>();

        /*I am creating the objects from the user defined data type*/
        Item item1 = new Item("Tv",20000);
        Item pizza = new Item("pizza",500);
        Item lasagna = new Item("lasagna",900);
        Item chicken = new Item("chicken",500);
        Item burrito = new Item("burrito",200);
        Item noodles = new Item("noodles",300);
        Item donut = new Item("donut",100);
        Item cheetos = new Item("cheetos",150);

        /*I am going to add objects from the user defined type to the list*/
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(item1));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(pizza));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(lasagna));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(chicken));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(burrito));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(noodles));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(donut));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(cheetos));
        System.out.println("\n");
        /* toArray shows what is in the list in the form of an array */
        bigBag2.toArray();
        System.out.println("\n");

    }

    @Test
    @DisplayName("Should not be empty - bags with items are not empty")
    void testEmpty(){
        assertFalse(bigBag2.isEmpty());
    }

    @Test
    @DisplayName("Should have 8")
    void testGetCurrentSize(){
        assertEquals(8, bigBag2.getCurrentSize());
    }

    public static void main(String[]args){

        /* This creates the object using the constructor from the LinkedListBag class which
        implements the bagDataStructure interface */
        bagDataStructure<Item> bigBag2 = new LinkedListBag<>();

        /*I am creating the objects from the user defined data type*/
        Item item1 = new Item("Tv",20000);
        Item pizza = new Item("pizza",500);
        Item lasagna = new Item("lasagna",900);
        Item chicken = new Item("chicken",500);
        Item burrito = new Item("burrito",200);
        Item noodles = new Item("noodles",300);
        Item donut = new Item("donut",100);
        Item cheetos = new Item("cheetos",150);

        /*I am going to add objects from the user defined type to the list*/
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(item1));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(pizza));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(lasagna));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(chicken));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(burrito));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(noodles));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(donut));
        System.out.println("Here I am adding an object using the user defined type item = " + bigBag2.add(cheetos));
        System.out.println("\n");
        /* toArray shows what is in the list in the form of an array */
        bigBag2.toArray();
        System.out.println("\n");


        /* This section will test the methods using bigBag2 */


        System.out.println("This is testing the contains method = " + bigBag2.contains(pizza));
        System.out.println("\n");
        System.out.println("This is testing the getFrequencyOf method = " + bigBag2.getFrequencyOf(burrito));
        System.out.println("\n");
        System.out.println("This is testing the removeRandom method = " + bigBag2.removeRandom());
        System.out.println("\n");
        System.out.println("This is testing the removeSpecific method = " + bigBag2.removeSpecific(item1));
        System.out.println("\n");

        bigBag2.clear();
        System.out.println("The clear method was just used, but there is no return value so yeah");





    }
}

