import java.lang.reflect.*;

class Vehicle{
    private int vid;
    private String name;
    private Vehicle(){}

    private Vehicle(Integer vid,String name){
        this.vid=vid;
        this.name=name;
    }

    public void setVehicleId(Integer vid){
        this.vid=vid;
    }

    public void setVehicleName(String name){
        this.name=name;
    }

    public Integer getVehicleId(){
        return vid;
    }

    public String getVehicleName(){
        return name;
    }
}


public class PvtConstructorDemo {
    public void CreateObj(int vid,String name) throws Exception{
        Constructor <Vehicle> constt=Vehicle.class.getDeclaredConstructor();
        constt.setAccessible(true);
        Object obj=constt.newInstance();

        if(obj instanceof Vehicle){
            Vehicle v=(Vehicle)obj;
            v.setVehicleId(vid);
            v.setVehicleName(name);
            System.out.println("Vehicle ID : "+v.getVehicleId());
            System.out.println("Vehicle Name : "+v.getVehicleName());
        }
    }


    public void CreateObjByConstructorname(int vid,String name) throws Exception{
        Constructor <Vehicle> constt=Vehicle.class.getDeclaredConstructor(Integer.class,String.class);

        if(Modifier.isPrivate(constt.getModifiers())){
            constt.setAccessible(true);
            Object obj=constt.newInstance(vid,name);
            if(obj instanceof Vehicle){
                Vehicle v=(Vehicle)obj;
                System.out.println("Vehicle ID : "+v.getVehicleId());
            System.out.println("Vehicle Name : "+v.getVehicleName());
            }
        }
    }


    public static void main(String[] args) throws Exception{

        PvtConstructorDemo ob=new PvtConstructorDemo();
        ob.CreateObj(20, "Rishabh");
        System.out.println("****************************");
        ob.CreateObjByConstructorname(30,"Rishu");

        
    }


}
