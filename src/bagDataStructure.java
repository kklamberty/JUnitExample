/**
 * Chineng "Cookie" Vang
 * Data Structures 10/4/19
 * Linked List Bag
 * @param <T>
 *     This code will add objects of the generic type and also user defined objects
 */

public interface bagDataStructure<T> {
    public int getCurrentSize();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public T removeRandom();
    public boolean removeSpecific(T anEntry);
    public void clear();
    public int getFrequencyOf(T anEntry);
    public boolean contains(T anEntry);
    public T[] toArray();


}

// Method 1 returns the current size/number of elements in the array
/* Method 2 sees if the array is empty or not and returns true or false based on whether or not the method
was successful */
/* Method 3 adds a new input entry to the array. The type of objects (string, int, double) that will be in
the array will be defined in the client class */
/* Method 4 will remove a random element from the array and will return true or false based on whether or not
the method was successful */
/* Method 5 will remove an element specified by the user if the element exists in the array. It will return
either true or false whether or not the method was successful */
// Method 6 will clear all objects/elements from the array and doesn't return anything
// Method 7 will return the integer numbers of times that a specified entry appears in the array
// Method 8 will return true or false whether or not the array contains a specified entry
// Method 9 will assist the add method (Method 3) in seeing all of the bag's contents

