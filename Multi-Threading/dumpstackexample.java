public class dumpstackexample {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        thread.setName("My dumpStack");

        thread.setPriority(6);

        System.out.println("Current Thread :"+thread);

        int count=thread.activeCount();

        System.out.println("currently active thread :"+count);

        Thread.dumpStack();
    }
}
