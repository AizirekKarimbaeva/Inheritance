public class Programmer extends Person{
    String companyName;

    public Programmer(String name ,String  companyName) {
        super(name);
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("If don't tired, keep coding !,else tired,drink coffee.");
    }

    @Override
    public void learn() {
        System.out.println( "Programmer learning");
    }

    @Override
    public void walk() {
        System.out.println( "Programmer walking");
    }

    @Override
    public void eat() {
        System.out.println( "Programmer eating");
    }

    @Override
    public String toString() {
        return "Programmer: "+getName()+"."+"\n"+
                "Company name: "+companyName+"."+"\n";
    }
}

    

