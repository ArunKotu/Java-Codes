import java.util.*;;
public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> newList = list;
        // Adding Elements - 1
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("C");
        list.add("Java");
        // //size() gives its size -2
        System.out.println(list.size());
        // // isEmpty() checks is list empty or not -3 
        System.out.println(list.isEmpty());
        // //contains() checks given ele present or not-4
        System.out.println(list.contains("Java"));
        // //indexOf() return Index at given Element - 5
        System.out.println(list.indexOf("Java"));
        // //lastIndexOf() gives Element last occurance index - 6
        System.out.println(list.lastIndexOf("Java"));
        // //toArray() converts list to array - 7
        String[] newArr = list.toArray(new String[list.size()]);
        for (String string : newArr) {
            System.out.print(string+" ");
        }
        System.out.println();
        // //get() returns element at that index - 8
        System.out.println(list.get(1));
        // //getFirst() return list starting element - 9
        System.out.println(list.getFirst());
        // //getLast() returns last element in the list - 10
        System.out.println(list.getLast());
        // //set() replace element at particular index - 11
        System.out.println(list.set(1, "DevOps"));
        // //add(E e, int i) adding element at particular index - 12 
        list.add(2,"Go");
        // //addFirst() add element at start of list - 13
        list.addFirst("Ansible");
        // //addLast() add element at last of list -14
        list.addLast("Docker");
        // //remove() remove element based on index -15
        System.out.println(list.remove(1));
        // //removeFist() remove firs element - 16
        System.out.println(list.removeFirst());
        // //removeLast() remove last element from list - 17
        System.out.println(list.removeLast());
        // //equals() is both contains same elements with same order returns true - 18
        System.out.println(list.equals(newList));
        //remove() based on Object - 19
        System.out.println(list.remove("Java"));
        //addAll() add all the elements from other collection - 20
        list.addAll(newList);
        //addAll(index,collection) starts adding collection from paticular index -21
        list.addAll(1,newList);
        //removeAll() remove elements that are common on both collection - 22
        System.out.println(list.removeAll(newList));
        //retainAll() Intersection of two lists (but it modifies the original list) -23
        System.out.println(list.retainAll(newList));
        //forEach() loops through list - 24
        list.forEach(x->System.out.print(x+" "));
        //removeIf() conditional removal of elements - 25
        System.out.println(list.removeIf(x->x.length()>5));
        //sort() sort elements in acending or decending - 26
        list.sort((o1,o2)->o2.compareTo(o1));
        //clear() clears the list - 20
        list.clear();
    }
}