package kunalkushwaha.array_03.linearSearch_03.A_2D;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth_05 {
    public static void main(String[] args) {


    }
    public int maximumWealth(int[][] accounts){
        //person=row
        //account=col
        int ans=Integer.MIN_VALUE;
        

        for (int person = 0; person <accounts.length ; person++) {
            //WHEN YOU START A NEW COL,Take anew sum for that row
            int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum+=accounts[person][account];
            }

            //now we have sum of accounts of person
            //check with overall answer
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
