public class p6{
    public static void main(String args[]){
        employee e1=new employee("rishabh12345");
        String s1=e1.getPancardnumber();
        System.out.println("Pancard Number is : "+s1);
    }
}


 final class employee{
    final String pancardnumber;

    public employee(String pancardnumber){
        this.pancardnumber=pancardnumber;
    } 

    public String getPancardnumber(){
        return pancardnumber;
    }
}

