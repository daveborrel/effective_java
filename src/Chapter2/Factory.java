package Chapter2;

public class Factory {

    private String name;
    private Integer budget;

    // The more generic way to allow Clients to create an instance of a class
    public Factory(String name, Integer budget) {
        this.name = name;
        this.budget = budget;
    }

    // Returns an instance of a class
    public static Factory makeFactory(String name, Integer budget) {
        return new Factory(name, budget);
    }
}
