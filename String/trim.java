public class trim {
    public static void main(String args[]){
        // String s1=" Rishabh Kashyap  ";
        // System.out.println(s1);
        // System.out.println(s1.length());
        // //System.out.println(s1.trim()+"j");

        // String tr=s1.trim();
        // System.out.println(tr.length());
        // System.out.println(tr);

        // String str=" rishabh ";

        // if((str.trim()).length()>0){
        //     System.out.println("the string has characters other than white spaces");
        // }else{
        //     System.out.println("the String contains only white spaces");
        // }

        // String str1="  ";

        // if((str1.trim()).length()>0){
        //     System.out.println("the string has characters other than white spaces");
        // }else{
        //     System.out.println("the String contains only white spaces");
        // }

        String str= " abc ";
        String str1=str.trim();
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode()+"\n");

        String str3= " xyz ";
        String str4=str3.trim();
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode()+"\n");

    }
}
