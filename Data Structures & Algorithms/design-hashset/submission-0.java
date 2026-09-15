class MyHashSet {
   List<Integer> []buckets;
   private int size=10000;
    
    public MyHashSet() 
    {
    buckets = new ArrayList[size];
    for(int i=0;i<size;i++)
    {
        buckets[i]=new ArrayList<>();
    }

    }
    
    public void add(int key) 
    {
        int index=key%size;

        if(!buckets[index].contains(key))
        {
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) 
    {
        int index = key%size;

        buckets[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) 
    {
        int index=key%size;

        return buckets[index].contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */