class Solution {
    public boolean isPalindrome(int x) {
        
        int pal=x;
        int res=0;
        while(x>0){
            int last=x%10;
            res=res*10+last;
            x=x/10;
        }
        if(res==pal){
            return true;
        }
        else{
            return false;
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        Solution sol = new Solution(); 
        boolean result = sol.isPalindrome(x);
        System.out.println(result);


    }
}