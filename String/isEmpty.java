public class isEmpty {
    public static void main(String args[]){
        String s1="";
        String s2="rishabh";
        // System.out.println(s1.isEmpty());
        // System.out.println(s2.isEmpty());

        // if(s1.length()==0||s1.isEmpty()){
        //     System.out.println("String s1 is empty");
        // }else{
        //     System.out.println("s1 : "+s1);
        // }

        // if(s2.length()==0||s2.isEmpty()){
        //     System.out.println("String s2 is empty");
        // }else{
        //     System.out.println(s2);
        // }

        // String str1=null;

        // // if(str1.isEmpty()){
        // if(str1 == null){
        //     System.out.println("the string is null");
        // }else{
        //     System.out.println("the string is not null");
        // }

        String str="    ";
        int size=str.length();



        if(size==0){
            System.out.println("the string is empty");
        }else if (size>0&&str.trim().isEmpty()) {
            System.out.println("the string is blank");
        }else{
            System.out.println("the string is not blank");
        }

        str="rishabh";
        size=str.length();

        if(size==0){
            System.out.println("the string is empty");
        }else if (size>0&&str.trim().isEmpty()) {
            System.out.println("the string is blank");
        }else{
            System.out.println("the string is not blank");
        }
    }
}
