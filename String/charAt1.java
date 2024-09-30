import java.util.ArrayList;

public class charAt1 {

    
        ArrayList <Character> al;

        charAt1(){
            al=new ArrayList<Character>();

            al.add('A');al.add('a');
            al.add('E');al.add('e');
            al.add('I');al.add('i');
            al.add('O');al.add('o');
            al.add('U');al.add('u');
        }

        private boolean isVowel(char c){
            for (int i=0;i<al.size();i++){
                if(c==al.get(i)){
                    return true;
                }
            }
            return false;
        }

        public int countVowels(String s){
            int countVowel=0;
            int size=s.length();
            for(int j=0;j<size;j++){
                char c=s.charAt(j);
                if(isVowel(c)){
                    countVowel=countVowel+1;
                }
            }
            return countVowel;
        }

        public static void main(String args[]){
            charAt1 obj=new charAt1();
            String str="My name is Rishabh KAshyap";

            int noOfVowel=obj.countVowels(str);

            System.out.println("String :"+str);
            System.out.println("number of Vowels :"+noOfVowel);

            str="hello guys, hiii";

            noOfVowel=obj.countVowels(str);

            System.out.println("String :"+str);
            System.out.println("number of Vowels :"+noOfVowel);
    }
    
}
