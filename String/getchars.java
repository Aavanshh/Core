public class getchars {
    public static void main(String args[]){
        String str=new String("Hello javatpoint, how are you");
        char ch[]=new char[10];

        try{
            str.getChars(6, 6, ch, 2);
            System.out.println(ch);
        }catch(Exception e){System.out.println(e);}
    }
}
