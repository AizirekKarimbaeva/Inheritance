public class Dancer extends Person{
    String groupName;
    public Dancer(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String dancing() {
            return "Dancer dancing.";
    }
    @Override
    public void learn() {
        System.out.println( "Dancer learning");
    }
    @Override
    public void walk() {
        System.out.println("Dancer walking");
    }
    @Override
    public void eat() {
        System.out.println( "Dancer eating");
    }
    @Override
    public String toString() {
        return "Dancer: "+getName()+"."+"\n"+
                "Group name: "+groupName+"."+"\n";
    }
}
