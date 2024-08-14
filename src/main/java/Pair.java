/**
 * Author : Rajdeep Deb
 * Date   : 02-08-2024
 * Time   : 01:18 PM
 */
public class Pair <T extends Number>{

    T first;
    T second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
