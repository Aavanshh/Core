public class replace {

    public static void main(String args[]){
        // String str="Welcome to javatpoint Rishabh";

        // // String repstring=str.replace('e', '$');
        // // System.out.println(repstring);

        // String repstring=str.replace("to", "rishabh");
        // System.out.println(repstring);

        // String str="oooooooooooo-hhhhhhhh-oooooooooooooooo";
        // String replaceString=str.replace("h", "t");
        // System.out.println(replaceString);
        // replaceString=replaceString.replace("o", "q");
        // System.out.println(replaceString);

        String str="Welcome to the world buddy";
        int size=str.length();

        System.out.println(str);
        String target=null;

        str=str.replace(target, "javatpoint");
        System.out.println(str);

    }
    
}
