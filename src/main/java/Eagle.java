/**
 * Author : Rajdeep Deb
 * Date   : 04-08-2024
 * Time   : 12:07 AM
 */
@Category(name="bird")
@Category(name="Hunter")
@Category(name="carnivore")
public class Eagle {

    public String breed;
    private boolean canSwim;


    private Eagle(){

    }
    public void fly(int intParam,boolean boolParam,String strParam){

        System.out.println("fly intParam "+intParam+" boolParam "+boolParam+" strParam "+strParam);
    }
    public void fly2(){
        System.out.println("fly2");
    }
    public void eat(){
        System.out.println("eat");
    }
}
