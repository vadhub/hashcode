public class Person {
    
    private String name;
    private int age;
    private boolean isActive;

    public Person(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + this.age;
        hash = 31 * hash + (this.isActive ? 1 : 0);
        return hash;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Person other = (Person) obj;
//        if (this.age != other.age) {
//            return false;
//        }
//        if (this.isActive != other.isActive) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        return true;
//    }
    
    
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", isActive=" + isActive + '}';
    }
    
    
    
}
