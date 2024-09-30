public class substringPalindrome {
    
    public boolean isPalindrome(String str){
        int size=str.length();

        if(size==0||size==1){
            return true;
        }

        String f=str.substring(0, 1);
        String l=str.substring(size-1);

        if(l.equals(f)){
            return isPalindrome(str.substring(size-1));
        }
        return false;
    }

    public static void main(String args[]){
        substringPalindrome s1=new substringPalindrome();
        String str[]={
            "madam",
            "rock",
            "eye",
            "noon",
            "kill"
        };


        int size=str.length;

        for(int i=0;i<size;i++){
            if(s1.isPalindrome(str[i])){
            System.out.println(str[i]+" is a Palindrome");}
            else{
                System.out.println(str[i]+" is not a Palindrome");}
            }
        }
    }

