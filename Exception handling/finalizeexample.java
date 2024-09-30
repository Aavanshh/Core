public class finalizeexample {
    public static void main(String args[]){
        finalizeexample fe=new finalizeexample();
        System.out.println("Hashcode is :"+fe.hashCode());
        fe=null;

        System.gc();
        System.out.println("end of garbage collection");
    }

    protected void finalize(){
        System.out.println("called the finalize method");
    }
}
