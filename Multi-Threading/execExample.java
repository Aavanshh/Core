public class execExample {
    public static void main(String[] args) throws Exception{
        // Runtime.getRuntime().exec("notepad");
        // Runtime.getRuntime().exec("shutdown -s -t 0");
        // Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
        // System.out.println(Runtime.getRuntime().availableProcessors());
        
        Runtime r=Runtime.getRuntime();

        System.out.println("Total-memory : "+r.totalMemory());
        System.out.println("free-memory : "+r.freeMemory());

        for(int i=0;i<10000;i++){
            new execExample();
        }

        System.out.println("after creating 10000 instance , free memory :"+r.freeMemory());
        System.gc();
        System.out.println("Afterb gc(), free memory : "+r.freeMemory());

    }
    
}
