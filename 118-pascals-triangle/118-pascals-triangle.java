class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            result.add(list);
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        for (int i = 1; i < numRows; i++) {
            
            List<Integer> list = new ArrayList<>();
            List<Integer> prev = result.get(i-1);
            
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(prev.get(j-1)+ prev.get(j));               
                
            }
            list.add(1);
            result.add(list);
            
        }
        return result;
    }
}