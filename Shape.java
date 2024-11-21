public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
    
}