package Idade;

public class AgeVerifier {

    public boolean isAdult(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa");
        }
        return age >= 18;
    }
}
