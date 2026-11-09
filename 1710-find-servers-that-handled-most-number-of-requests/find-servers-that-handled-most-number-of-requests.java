class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> fri = new TreeSet<>();
        for(int i=0; i<k; i++){
            fri.add(i);
        }
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        int[] cnt =new int[k];
        int n = arrival.length;
        for(int i=0; i<n; i++){
            long t = arrival[i];
            while(!busy.isEmpty() && busy.peek()[0] <= t){
                fri.add((int) busy.poll()[1]);
            }
            if(fri.isEmpty())continue;
            int pref = i % k;
            Integer s = fri.ceiling(pref);
            if(s== null)s= fri.first();
            fri.remove(s);
            cnt[s]++;
            busy.offer(new long[]{t + load[i], s});       
        }
        int mx =0;
            for(int c: cnt)mx = Math.max(mx, c);
            List<Integer> ans = new ArrayList<>();
            for(int j=0; j<k; j++){
                if(cnt[j] == mx )ans.add(j);
            }
            return ans;
    }
}