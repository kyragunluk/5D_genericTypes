/**
  OrderedList_inArraySlots

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

import java.util.*;

public class OrderedList_inArraySlots{

    private ArrayList<Integer> list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new ArrayList();
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return list_iAS.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        String result = "[";
        for(int index = 0; index<list_iAS.size(); index++){
            result += list_iAS.get(index) + ",";
        }
        result += "]";
        return result;
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( Integer value) {
        for (int index = 0 ; index < list_iAS.size()-1 ; index++){
            if (value > list_iAS.get(index)){
                list_iAS.add(index+1,value);
                return true;
            }
        }
        list_iAS.add(0,value);
        return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public int get( int index ) {
        return list_iAS.get(index);
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public int remove( int index) {
        return list_iAS.remove(index);
    }
}
