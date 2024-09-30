public class charAt {
    
    public static void main(String args[]){
        String name="Rishabh";
        char ch=name.charAt(4);
        System.out.println(ch);
        
        //char ch1=name.charAt(10);
       // System.out.println(ch1);

       String str="my name is Rishabh Kashyap";
       int strLength=str.length();
       //System.out.println("character at index 0 : "+str.charAt(0));

       //System.out.println("Character at last index is :"+str.charAt(strLength-1));

        for(int i=0;i<str.length()-1;i++){
            if(i%2!=0){
                System.out.println("char at :"+i+" place is "+str.charAt(i) );
            }
        }

        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("total no of 'a' :"+count);
    }
}
