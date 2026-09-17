package greeter;

public class Greeter {
    private final GreeterMessageFactory greeterMessageFactory = new GreeterMessageFactory();
    String formality;

    public String greet() {
        return greeterMessageFactory.getString(formality);
    }



    public void setFormality(String formality) {
        this.formality = formality;
    }
}