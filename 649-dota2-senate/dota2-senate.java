class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qrad = new LinkedList<>();
        Queue<Integer> qdir = new LinkedList<>();
        int n = senate.length();
        for(int i=0 ; i<n; i++){
            if(senate.charAt(i) == 'R'){
                qrad.add(i);
            }
            else{
                qdir.add(i);
            }
        }
        while(!qrad.isEmpty() && !qdir.isEmpty()){
            if(qrad.peek() < qdir.peek()){
                qrad.add(n++);
            }
            else{
                qdir.add(n++);
            }
            qrad.poll(); 
            qdir.poll();
        }
        return qrad.isEmpty() ? ("Dire") : ("Radiant");
    }
}