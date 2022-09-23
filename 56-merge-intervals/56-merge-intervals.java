class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] element:intervals){
            if(list.size()==0){
                list.add(element);
            }else{
                int[] prev=list.get(list.size()-1);
                if(element[0]<=prev[1]){
                    prev[1]=Math.max(element[1],prev[1]);
                }
                else{
                    list.add(element);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}