public class DeadLocksolved {

    public static void main(String[] args) {
        DeadLocksolved test=new DeadLocksolved();

        final resource1 a=test.new resource1();
        final resource2 b=test.new resource2();

        Runnable b1=new Runnable(){
            public void run(){
                synchronized(b){
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException ie){
                        ie.printStackTrace();
                    }

                    synchronized(a){
                        System.out.println("block 1");
                    }
                }
            }
        };

        Runnable b2=new Runnable() {
            public void run(){
                synchronized(b){
                    synchronized(a){
                        System.out.println("In block 2");
                    }
                }
            }
        };

        new Thread(b1).start();
        new Thread(b2).start();




    }


    private class resource1{
        private int i=10;
        public int getI(){
            return i;
        }

        public void setI(int i){
            this.i=i;
        }
    }

    private class resource2{
        private int i=20;
        public int getI(){
            return i;
        }

        public void setI(int i){
            this.i=i;
        }
    }
    
}
