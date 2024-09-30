public class format {
    public static void main(String args[]){
        String name="sonoo";

        String sf1=String.format("name is %s", name);
        String sf2=String.format("value of %f", 32.33434);
        String sf3=String.format("value of %32.12f", 32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

// String str1=String.format("%d", 101);
// String str2=String.format("%s", "amar Singh");
// String str3=String.format("%f", 101.02);
// String str4=String.format("%x", 101);
// String str5=String.format("%c", 'c');

// String str1=String.format("%d", 101);
// String str2=String.format("|%10d|", 101);
// String str3=String.format("|%-10d|", 101);
// String str4=String.format("|%d|", 101);
// String str5=String.format("|%010d|", 101);

// System.out.println(str1);
// System.out.println(str2);
// System.out.println(str3);
// System.out.println(str4);
// System.out.println(str5);




    }
}
