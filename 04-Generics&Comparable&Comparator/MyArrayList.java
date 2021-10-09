
import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
    private int size;
    private Object[] elements;

    public MyArrayList() {
        size = 0;
        elements = new Object[10];
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return (E) elements[index];
    }


    public void set(int index, E data) {
        elements[index] = data;
    }

    public void add(E data) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size] = data;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }


    public boolean contains(E data) {
        if (data instanceof Comparable) {
            for (int i = 0; i < size; i++) {
                Comparable c = (Comparable) data;

                if (c.compareTo(elements[i]) == 0) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (data.equals(elements[i])) {
                    return true;
                }
            }
        }

        return false;
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable) elements[i]).compareTo(elements[j]) > 0) {
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    public void sort(Comparator<E> comparator) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (comparator.compare((E) elements[i], (E) elements[j]) > 0) {
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]).append(", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(", "));
        return sb.toString();
    }
}