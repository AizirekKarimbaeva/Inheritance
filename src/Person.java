public abstract class Person {
     String name;
     String designation;

    public Person(String name) {
        this.name = name;
    }
    
    public void learn(){
        System.out.println("learning");
    }
    public void walk(){
        System.out.println("Walking");
    }
    public void eat(){
        System.out.println("Eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name:'" + name + '\'' +
                ", Designation:'" + designation + '\'' +
                '}';
    }




}
