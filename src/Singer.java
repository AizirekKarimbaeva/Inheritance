public class Singer extends Person{
    String bandName;
    public Singer(String name, String bandName) {
        super(name);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String singing(){
        return "Beyonce sings a song.";
    }

    public void playGitar(){
        System.out.println("Guitarist playing the guitar.");
    }

    @Override
    public void learn() {
        System.out.println( "Singer learning");
    }

    @Override
    public void walk() {
        System.out.println( "Singer walking");
    }

    @Override
    public void eat() {
        System.out.println( "Singer eating");
    }
    @Override
    public String toString() {
        return "Singer: "+getName()+"."+"\n"+
                "Band name: "+ bandName+"."+"\n";
    }
}
