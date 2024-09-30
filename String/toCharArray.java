public class toCharArray {
    public static void main(String args[]){
        // String s1="hello";
        // char ch[]=s1.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     System.out.println(ch[i]);
        // }

        String s1="Welcome to javatpoint";
        char ch[]=s1.toCharArray();

        int len=ch.length;

        System.out.println("char array length : "+len);
        System.out.println("char array elements : ");

        for(int i=0;i<len;i++){
            System.out.println(ch[i]);
        }


    }
}
