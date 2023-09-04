/**
    A class of bags whose entries are stored in a fixed-size array.
    INITIAL, INCOMPLETE DEFINITION; no security checks
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public final class ArrayBag<T> implements BagInterface<T>
{
	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25;

	/** Creates an empty bag whose initial capacity is 25. */
	public ArrayBag()
	{
		this(DEFAULT_CAPACITY);
	} // end default constructor

	/** Creates an empty bag having a given initial capacity.
       @param desiredCapacity  The integer capacity desired. */
	public ArrayBag(int desiredCapacity)
	{
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
      T[] tempBag = (T[])new Object[desiredCapacity]; // Unchecked cast
      bag = tempBag;
      setNumberOfEntries(0);
	} // end constructor

	/** Adds a new entry to this bag.
       @param newEntry  The object to be added as a new entry.
       @return  True if the addition is successful, or false if not. */
	public boolean add(T newEntry)
	{
		return false;
		// To be defined
	} // end add
   
	/** Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
	public T[] toArray()
	{
		return bag;
		// To be defined
	} // end toArray
	
   // Returns true if the array bag is full, or false if not.
	private boolean isArrayFull()
	{
		return false;
		// To be defined
	} // end isArrayFull

	@Override
	public int getCurrentSize() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		return false;
	}

	@Override
	public void clear() {
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	public T[] getBag() {
		return bag;
	}

	public int getNumberOfEntries() {
		return numberOfEntries;
	}

	public void setNumberOfEntries(int numberOfEntries) {
		this.numberOfEntries = numberOfEntries;
	}
} // end ArrayBag
