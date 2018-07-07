package main.java.com.peryomin.ds.iterators;

import java.util.List;

public class EvenListIterator {
    private List<Integer> list;
    private int index = 0;
  
    public EvenListIterator (List<Integer> list) {
        this.list = list;
    }
  
    public Integer next() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return list.get(index);
    }
  
    public boolean hasNext() {
        while (index + 1 <= list.size()) {
            if (list.get(index) % 2 == 0) {
                return true;
            }
          	index++;
        }
        return false;
    }
}
