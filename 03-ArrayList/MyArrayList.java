
import java.util.Arrays;

public class MyArrayList {
    private int[] elements;
    private int size;

    public MyArrayList(){
        this.size = 0;
        this.elements = new int[10];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int get(int index){
        return elements[index];
    }

    public void set(int index, int data){
        elements[index] = data;
    }

    public boolean contains(int data){
        for (int i = 0; i < size; i++) {
            if(elements[i] == data){
                return true;
            }
        }
        return false;
    }
    
    public int lastIndexOf(int data){
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if(elements[i] == data){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public void add(int data){
        if(this.size == this.elements.length){
            elements = Arrays.copyOf(elements, this.size * 2);
        }
        elements[size] = data;
        size++;
    }

    public void remove(int index){
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = 0;
        size--;
    }


    public void addAll(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]).append(",");
        }

        return sb.toString();
    }
}
