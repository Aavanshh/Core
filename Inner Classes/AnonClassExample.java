// abstract class Person{
//     abstract void eat();
// }

interface Eatable{
    void eat();
}

 class AnonClassExample {
    public static void main(String args[]){
        // Person p=new Person() {
        //     void eat(){
        //         System.out.println("nice fruits");
        //     }
        // };

        // p.eat();

        Eatable e1=new Eatable() {
            public void eat(){
                System.out.println("nice fruits");
            }
        };

        e1.eat();
    }
    
}
