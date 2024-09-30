public class getstackExample {
    public static void main(String[] args) {
        first();
    }

    public static void  first(){
        second();
    }

    public static void second(){
        third();
    }

    public static void third(){
        StackTraceElement[] stackTrace=Thread.currentThread().getStackTrace();
        System.out.println("Displaying stack trace using StackTraceElement in java");

        for(StackTraceElement st:stackTrace){
            System.out.println(st);
        }
    }
}
