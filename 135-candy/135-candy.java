class Solution {
    public int candy(int[] ratings) {

    int [] candies=new int[ratings.length];
    Arrays.fill(candies,1);
    int back=ratings.length-1;
    //Scanning left side ratings of each child
    for(int i=1;i<ratings.length;i++)
    {
        if(ratings[i]>ratings[i-1])
        {
            candies[i]=candies[i-1]+1;    
        }
    }
     //Scanning right side ratings of each child
    for(int i=ratings.length-2;i>=0;i--)
    {
        if(ratings[i]>ratings[i+1])
        {
            candies[i]=Math.max(candies[i],candies[i+1]+1);
        }
    }
    int totalCandies=0;
    //calculating total candies from candies Array
    for(int candie:candies)
    {
        totalCandies+=candie;  
    }
    return totalCandies;
    }
}