import java.util.List;

/**
 * Author : Rajdeep Deb
 * Date   : 02-08-2024
 * Time   : 01:32 PM
 */
public class PrintV {

    public void printList(List<? extends Vehicle>list){

        for(var x:list){

            x.display();
        }
    }
    public <T extends Vehicle>void printListGen(List<T>list){

        for(var x:list){

            x.display();
        }
    }
}
