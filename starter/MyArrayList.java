/*
 * Name: Nikita Prasad
 * Email: nnprasad@ucsd.edu
 * PID: A16279669
 * Sources Used: Java Interface Documentation, PA1 Write-up
 * This file implements the MyList Abstract class
 */
import java.util.Scanner;

/*
 * Class header
 */
public class MyArrayList implements MyList {
    
    //data structure of the ArrayList
    Object[] data;

    //size of the arraylist
    int size;

    //private static variables instead of magic numbers
    private static final int DEFAULT_CAPACITY = 5; 

    /**
     * Initialise data to an array of objects of DEFAULT_CAPACITY
     */ 
    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0; 
    }

    /**
     * initialise data to an array of objects of initialCapacity
     */ 
    public MyArrayList(int initialCapacity) {

        //exception if argument is invalid
        if (initialCapacity < 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.data = new Object[initialCapacity];
            this.size = 0;
        }
    }

    /**
     * initialise data to an array of objects copied from arr 
     */ 
    public MyArrayList(E[] arr) {

        //default constructor called if null array
        this ();
        if (arr != null) {
            this.data = new Object[arr.length()];
            this.size = arr.length(); 
            for (int i=0; i<arr.length(); i++) {
                this.data[i] = arr[i];
            }
        }
    }

    /**
     * Expanding the capacity of arraylist
     */
    public void expandCapacity(int requiredCapacity) {



    }

    /**
     * Obtaining capacity of the arraylist
     */
    public int getCapacity() {
        int i = 0; 
        while (true) {
            try {


            }

        }

    }

    /*
     * inserting element at specified index
     */
    public void insert (int index, E element) {

        //if there is no space in arraylist
        if ((getCapacity()-this.size) == 0) {
            expandCapacity(this.size+1);
        }

        //shifting all elements after given index by one place
        for (int i=index; i<getCapacity(); i++) {
            this.data[i+1] = this.data[i];
        }

        //inserting element into appropriate index
        this.data[index] = element; 

        //increasing size by 1
        this.size++; 
    }

    /*
     * Appending element to the end of arraylist
     */
    public void append (E element) {

        //if there is no space in the array
        if ((getCapacity()-this.size) == 0) {
            expandCapacity(this.size + 1);
        }

        //append element to the end of the arraylist
        this.data[this.size] = element; 
        size++; //increasing size by 1
    }

    /*
     * Appending element to the beginning of arraylist
     */
    public void prepend (E element) {
        
        //if there is no space in the array
        if ((getCapacity()-this.size) == 0) {
            expandCapacity(this.size + 1);
        }
    }

    /**
     * Number of valid elements in arraylist 
     */
    public int size() {
        return (this.size); 
    }














}
