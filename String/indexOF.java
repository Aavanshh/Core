public class indexOF {
    public static void main(String args[]){
        String s1="this is my name rishabh";
        // int index1=s1.indexOf("is");
        // int index2=s1.indexOf("rishabh");

        // System.out.println(index1);
        // System.out.println(index2);

        // int index3=s1.indexOf("is",3);
        // System.out.println(index3);

        // int index4=s1.indexOf('n');
        // System.out.println(index4);

        // int count=0;
        // int startfrom=0;

        // for(;;){
        //     int index=s1.indexOf('i',startfrom);
        //     if(index>=0){count+=1;startfrom=index+1;}
        //     else{break;}
        // }
        //     System.out.println("In the string : "+s1);
        //     System.out.println("the char 'm' has come :"+count+" times.");
        
int index=s1.indexOf("name",10);
System.out.println(index);

index=s1.indexOf("name",30);
System.out.println(index);

index=s1.indexOf("s",10);
System.out.println(index);


    }
}
