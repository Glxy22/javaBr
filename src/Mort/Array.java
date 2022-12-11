package Mort;

public class Array {
    private int[] items;
    private int count;
    public Array( int length){
        items = new int[length];
    }
    public void insert(int item){
        //declaring an array twice the size of items(array)
        if(items.length == count){
        int[] newarray = new int[count*2];
        for ( int i=0; i< count; i++){
            newarray[i] = items[i];
        }
        //set items to this newarray
        items = newarray;
        }
        items[count] = item;
        count++;

    }
    public void removeItem(int index){
        //check if the index is valid
        if(index < 0 || index >=count)
            throw new IllegalArgumentException();
        //move the items to the left to fill the gape
        for(int i = index; i < count; i++)
            items[index]= items[index+1];
        // decrement the index of array one as item has been deleted
        count--;

    }
    //run time complexity of this method is 0(n)
    // as if we have more items we have to look all of them

    public  int indexOf(int item){
        //check if the item is in the array return index othewise -1
        for( int i = 0; i < count; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }
    public void print(){
        for( int i=0; i < count; i++){
            System.out.println(items[i]);

        }
    }
}
