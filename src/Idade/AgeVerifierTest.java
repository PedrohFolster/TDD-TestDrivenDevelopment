package Idade;

import org.junit.Test;

public class AgeVerifierTest {

    @Test
    public void testValidAge() {
        AgeVerifier verifier = new AgeVerifier();

        // Testando valores válidos e inválidos
        int[] idades = {18, 25, 17, 19};

        for (int age : idades) {
            if (verifier.isAdult(age)) {
                System.out.println("Valor válido, a idade " + age + " é considerada adulta!");
            } else {
                System.out.println("Erro: A idade " + age + " não está sendo considerada como adulta.");
            }
        }
    }
}
