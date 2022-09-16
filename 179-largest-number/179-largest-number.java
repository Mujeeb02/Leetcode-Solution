class Solution {
    public String largestNumber(int[] nums) {
        
        String[] str=new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->{
            long n1=Long.parseLong(a+b);
            long n2=Long.parseLong(b+a);
            if(n1>n2){
                return 1;
            }
            else if(n2>n1){
                return -1;
            }
            else return 0;
        });
        StringBuffer sb = new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
        }
        if(sb.charAt(0)=='0'){
            return "0";
        }
        String s=sb.toString();
        
        return s;
    }
}