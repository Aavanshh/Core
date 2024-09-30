public class p7 {
    int rollno;
    String name,city;

    p7(int rollno,String name,String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public String toString(){
        return rollno+"*****"+name+"********"+city;
    }

    public static void main(String args[]){
        p7 obj1=new p7(101,"Rishabh" ,"Delhi");

        System.out.println(obj1);
    }
}
