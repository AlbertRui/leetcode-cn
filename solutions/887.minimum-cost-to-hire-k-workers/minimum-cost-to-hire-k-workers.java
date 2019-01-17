class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        int n = quality.length;
        Worker[] workers = new Worker[n];
        for(int i = 0; i < n; i++) workers[i] = new Worker(quality[i], wage[i]);
        Arrays.sort(workers);
        double res = 1e9;
        int curRes = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(Worker worker : workers) {
            queue.offer(-worker.quality);
            curRes += worker.quality;
            if(queue.size() > K) curRes += queue.poll();
            if(queue.size() == K) res = Math.min(res, curRes * worker.ratio());
        }
        return res;
    }
}

class Worker implements Comparable<Worker> {
    
    public int quality, wage;
    
    public Worker(int quality, int wage) {
        this.quality = quality;
        this.wage = wage;
    }
    
    public double ratio() {
        return (double) wage / quality;
    }
    
    public int compareTo(Worker other) {
        return Double.compare(ratio(), other.ratio());
    }
    
}  