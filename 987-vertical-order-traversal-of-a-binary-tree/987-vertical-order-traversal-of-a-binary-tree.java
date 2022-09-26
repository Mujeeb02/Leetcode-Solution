class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        
        helper(root, map, 0,0);
        
        List<List<Integer>> res = new ArrayList<>();
        for(Map<Integer,List<Integer>> levelMap: map.values()){
            List<Integer> list = new ArrayList<>();
            for(List<Integer> vals: levelMap.values()){
                Collections.sort(vals);
                list.addAll(vals);
            }
            res.add(list);
        }
        
        return res;
    }
    
    public void helper(TreeNode root, TreeMap<Integer,TreeMap<Integer,List<Integer>>> map, int column, int level){
        
        if(root==null){
            return;
        }
        
        if(map.containsKey(column)){
            TreeMap<Integer,List<Integer>> levelMap = map.get(column);
            if(levelMap.containsKey(level)){
                levelMap.get(level).add(root.val);
            }else{
                levelMap.put(level, new ArrayList<>(Arrays.asList(root.val)));
            }
        }else{
            TreeMap<Integer,List<Integer>> levelMap= new TreeMap<>();
            levelMap.put(level, new ArrayList<>(Arrays.asList(root.val)));
            map.put(column, levelMap);
        }
        
        helper(root.left, map, column-1, level+1);
        helper(root.right, map, column+1, level+1);
    }
}