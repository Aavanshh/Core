public class endsWith {
    public static void main(String args[]){
        String s1="my name is Rishabh";
        // System.out.println(s1.endsWith("t"));
        // System.out.println(s1.endsWith("abh"));
        // System.out.println(s1.endsWith("h"));
        // System.out.println(s1.endsWith(" Rishabh"));
        // System.out.println(s1.endsWith("rishabh"));

        // if(s1.endsWith(" Rishabh")){
        //     System.out.println("inside if block");

        // }else{
        //     System.out.println("inside else block");
        // }

        

        // System.out.println(s1.endsWith(""));
        // System.out.println(s1.endsWith(" "));

        // if(s1.endsWith(null)){
        //     System.out.println("inside if block");

        // }else{
        //     System.out.println("inside else block");
        // }

        if("Rishabh is the best".endsWith("best")){
            System.out.println("inside if block");
        }else{
            System.out.println("inside else Block");
        }

        if("Rishabh is the best".endsWith(" best")){
            System.out.println("inside if block");
        }else{
            System.out.println("inside else Block");
        }

        if("Rishabh is the best".endsWith("st")){
            System.out.println("inside if block");
        }else{
            System.out.println("inside else Block");
        }

        if("Rishabh is the best".endsWith("xyz")){
            System.out.println("inside if block");
        }else{
            System.out.println("inside else Block");
        }
    }
}
