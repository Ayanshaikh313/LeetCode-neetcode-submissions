class SmallestInfiniteSet {
    Set<Integer> st;
    PriorityQueue<Integer> pq;
    int next = 1;
    public SmallestInfiniteSet() {
        st = new HashSet<>();
        pq = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            int num = pq.poll();
            st.remove(num);
            return num;
        }
        return next++;
    }
    
    public void addBack(int num) {
        if(num<next && !st.contains(num)){
            pq.add(num);
            st.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */