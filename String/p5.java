public class p5 {
    
    public static void main(String args[]){

        long startTime=System.currentTimeMillis();
        StringBuffer sb1=new StringBuffer("Rishabh");
        for(int i=0;i<10000;i++){
            sb1.append(" Kashyap");
        }
        System.out.println("Time taken by string Buffer "+(System.currentTimeMillis()-startTime)+"ms");

        startTime =System.currentTimeMillis();

        StringBuilder sb2=new StringBuilder("Rishabh");

        for(int i=0;i<10000;i++){
            sb2.append(" Kashyap");
        }

        System.out.println("Time taken by stringBuilder :"+(System.currentTimeMillis()-startTime)+"ms");
    }
}
