public class Main {
    
    public static void main(String[] args) {
        Person p1 = new Person("Vasya", 100, true);
        Person p2 = new Person("Vasya", 100, true);
        
        System.out.println(p1.hashCode() + " " + p2.hashCode());
        
        System.out.println(p1.equals(p2));
        
        System.out.println(p1.hashCode() == p2.hashCode() && p1.equals(p2));
        
        Set<Person> set = new HashSet<>();
        set.add(p2);
        set.add(p1);
        
        System.out.println(set.size());
        
    }
        
        
}

