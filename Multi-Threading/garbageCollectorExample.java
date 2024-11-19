public class garbageCollectorExample {
    public void finalize(){
        System.out.println("object is garbage collected");
}

public static void main(String[] args) {
    garbageCollectorExample t1=new garbageCollectorExample();
    garbageCollectorExample t2=new garbageCollectorExample();
    t1=null;
    t2=null;
    System.gc();
}
    
}
