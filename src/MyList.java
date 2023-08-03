public interface MyList {
    public void add(Object obj);
    public void add(int index, Object obj);
    public void remove(Object obj);
    public void remove(int index);
    public Object get(int index);
    void set(int index, Object obj);
    public int indexOf(Object obj);
    public void lastIndexOf(Object obj);
    public boolean contains(Object obj);
    public int size();
    public void clear();

}
