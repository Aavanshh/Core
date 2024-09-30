public class split {
    public static void main(String args[]){
        // String str1="Welcome to javatpoint rishabh";
        // String[] words=str1.split("\\s");

        // for(String w:words){
        //     System.out.println(w);
        // }

        // String str1="Welcome to javatpoint rishabh";
        
        // for(String w:str1.split("\\s",0)){
        //     System.out.println(w);
        // }

        // for(String w:str1.split("\\s",1)){
        //     System.out.println(w);
        // }

        // for(String w:str1.split("\\s",2)){
        //     System.out.println(w);
        // }

        String str1="Welcome to javatpoint rishabh";

        String[] arr=str1.split("t",0);

        for(String w:arr){
            System.out.println(w);
        }

        System.out.println(arr.length);
    }
}
