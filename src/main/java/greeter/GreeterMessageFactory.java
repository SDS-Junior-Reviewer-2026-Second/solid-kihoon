package greeter;

public class GreeterMessageFactory {
    public GreeterMessageFactory() {
    }

    String getString(String formality) {
        if (formality == "formal") {
            return FormalGreeterMessage.getMessage();
        } else if (formality == "casual") {
            return CasualGreeterMessage.getMessage();
        } else if (formality == "intimate") {
            return IntimateGreeterMessage.getMessage();
        } else {
            return NormalGreeterMessage.getMessage();
        }
    }
}