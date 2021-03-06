public class client {
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
        System.out.println("This is testing the isEmpty method = " + bigBag2.isEmpty());
        System.out.println("\n");
        System.out.println("This is testing the CurrentSize method = " + bigBag2.getCurrentSize());
        System.out.println("\n");
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

