public interface IMyList<T> {
    int size();
    int getCapacity();
    public void add (T data);
    T get (int index);
    T set(int index, T data);
    String toString();
    int indexOf(T data);
    int lastIndexOf(T data);
    boolean isEmpty();
    T remove(int index);
    void clear();
    T[] toArray();
    boolean contains(T data);
    MyList<T> subList(int start, int finish);

}
