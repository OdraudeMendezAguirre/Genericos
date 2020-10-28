/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author odraude
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box<Integer> integerBox1 = new Box<Integer>();
Box<Integer> integerBox2 = new Box<>();
OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
Box rawBox = new Box();
Pair<Integer, String> p1a = new OrderedPair<>(1, "apple");
Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
//boolean same = Util.<Integer, String>compare(p1, p2);
//boolean same = Util.compare(p1, p2);
Object object = new Object();
Integer integer = new Integer(10);
object = integer;
Set<Integer> set = new HashSet<>();
Set rawSet = set;
rawSet.add("heap pollution!"); // heap pollution
set.stream().forEach(System.out::println); // ClassCastException

//
Set<Integer> set = new HashSet<>();
set = Collections.checkedSet(set, Integer.class);
Set rawSet = set;
rawSet.add("exception!");  // ClassCastException, no heap pollution
set.stream().forEach(System.out::println);
    }
    
}
