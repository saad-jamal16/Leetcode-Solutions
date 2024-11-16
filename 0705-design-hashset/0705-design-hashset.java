class MyHashSet {
    boolean[] set;
    int maxSize = 1000001; // Adjust array size to accommodate a large range of keys

    public MyHashSet() {
        set = new boolean[maxSize];
    }

    public void add(int key) {
        if (key < maxSize) {
            set[key] = true;
        }
    }

    public void remove(int key) {
        if (key < maxSize) {
            set[key] = false;
        }
    }

    public boolean contains(int key) {
        if (key < maxSize) {
            return set[key];
        }
        return false; // Return false for keys out of range
    }
}
