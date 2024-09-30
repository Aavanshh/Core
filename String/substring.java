public class substring {
 public static void main(String args[]){
    String s1="rishabh";
    // System.out.println(s1.substring(2,5));
    // System.out.println(s1.substring(4 ));

    // String str1=s1.substring(0);
    // System.out.println(str1);

    // String str2=s1.substring(3,6);
    // System.out.println(str2);

    // String str3=s1.substring(3,16);
    // System.out.println(str3);

    String str[]={
        "Rishabh kashyap",
        "Yuvrak Singh",
        "Vinod Singh",
        "Sadia aprveen",
        "Vishal Singh",
        "Pallavi shrivastava"
    };

    String surname="Singh";

    int surnamesize=surname.length();
    int size=str.length;

    for(int i=0;i<size;i++){
        int length=str[i].length();
        String substr=str[i].substring(length-surnamesize);
        //System.out.println(substr);

        if(substr.equals(surname)){
            System.out.println(str[i]);
        }
    }
    
 }   
}
