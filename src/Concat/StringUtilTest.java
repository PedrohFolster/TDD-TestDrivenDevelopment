package Concat;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    @Test
    public void testConcatenate() {
        StringUtil stringUtil = new StringUtil();

        // Strings de teste
        String str1 = "Olá, ";
        String str2 = "mundo!";

        // Resultado esperado
        String expected = "Olá, mundo!";

        // Chamada do método a ser testado
        String result = stringUtil.concatenate(str1, str2);

        // Verificação do resultado
        assertEquals(expected, result);
    }
}
