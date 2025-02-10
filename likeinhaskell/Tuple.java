package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 1: Implement this class. It should act like a tuple in e.g.
//  Haskell or Python. An object of this type should hold two values of
//  (possibly) different (arbitrary) types, and have the methods fst()
//  and snd() to return the respective components.
//  NOTE: The class should be read-only after initial construction.
public class Tuple<T1, T2> {
    T1 t1;
    T2 t2;

    public Tuple(T1 value1, T2 value2) {
        this.t1 = value1;
        this.t2 = value2;
    }

    public T1 fst() {
        return this.t1;
    }

    public T2 snd() {
        return this.t2;
    }


}

class Testcode{
    public static void main(String [] args) {
        Tuple<String, Integer> myTuple = new Tuple<>("Abc", 2);
        System.out.println(myTuple.t1);
        System.out.println(myTuple.t2);
        System.out.println();
    }
}
