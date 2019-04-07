package generics;

public class GenericDynamicArray<T> {

    private int initialSize;
//    private static final int INITIAL_SIZE = 0;
    private int currentIdx;
    private T[] array;

    /**
     *
     * @param initialSize
     */
    public GenericDynamicArray(int initialSize){
        this.initialSize = initialSize;
        array = (T[]) new Object[initialSize];
    }

    public GenericDynamicArray() {}

    public void add(T c){
        if(currentIdx == array.length){
            // create a new array
            T[] tmpArray = (T[]) new Object[array.length * 2];
            // copy the old array and add new array
            for(int i = 0; i < array.length; i++)
                tmpArray[i] = array[i];

            array = tmpArray;
            tmpArray = null;
        }
        // add an element
        array[currentIdx++] = c;
    }

    // an overloaded method
    public void add(int idx, T c){

        if(currentIdx == array.length){

            T[] tmpArray = (T[]) new Object[array.length * 2];
            for(int i = 0; i < idx; i++)
                tmpArray[i] = array[i];

            for(int i = idx + 1; i < array.length + 1; i++)
                tmpArray[i] = array[i - 1];

            tmpArray[idx] = c;
            currentIdx++;
            array = tmpArray;

            tmpArray = null;

        } else {
            for(int i = currentIdx; i > idx; i--)
                array[i + 1] = array[i];
            array[idx] = c;
            currentIdx++;
        }
    }

    public void remove(){
        // do not decrease the size of the array if it is not big
        // array[currentIdx] = '\0'; - not the approach to use
    }

    // public void remove(int idx){}

    public T getAt(int idx){
        return array[idx];
    }

    public int length(){
        return currentIdx;
    }
}