class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
          PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[1] - a[1]));
        pq.addAll(Arrays.asList(boxTypes));
        int units = 0;
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int addedBoxes = Math.min(truckSize, current[0]);
            units += addedBoxes * current[1];
            truckSize -= addedBoxes;
            if (truckSize == 0) {
                break;
            }            
        }
        return units;
    }
}