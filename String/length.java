public class length {
    public static void main(String args[]){
        // String s1="rishabh";
        // String s2="kashyap";

        // System.out.println(s1.length());
        // System.out.println(s2.length());

        // if(s1.length()>0){
        //     System.out.println("String is not empty & the length is "+s1.length());
        // }

        // String str="";

        // if(str.length()==0){
        //     System.out.println("String is empty now :"+str.length());
        // }

        // String str="Welcome to javatpoint";
        // int size=str.length();

        // System.out.println("Reverse of String is :"+" "+str+" "+" is :");
        // for(int i=0;i<size;i++){
        //     System.out.println(str.charAt(str.length()-i-1));
        // }

        String str="Welcome to javatpoint"; 
        int sizeWhiteSpaces=str.length();
        
        System.out.println(str);

        str=str.replace(" ", "");
        int sizeWithoutWhiteSpaces=str.length();

        int noOfWhiteSpaces=sizeWhiteSpaces-sizeWithoutWhiteSpaces;
        System.out.println("Total no of white spaces "+noOfWhiteSpaces);


}
}
