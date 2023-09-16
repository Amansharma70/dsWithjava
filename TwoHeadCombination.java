class TwoHeadCombination
{
    static int count=0;
    public static void CoinToss(int n,String ans,int count)
    {
        if(n==0)
        {
            System.out.println(ans+"");
            count++;
            return;
        }
    
       CoinToss(n-1, ans+"H");
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='T')
        {
       CoinToss(n-1, ans+"T");
        }
        System.out.println("the total number of combination pair "+count);
    }
    
    public static void main(String[] args) {
        CoinToss(3,"");
        
    }
}