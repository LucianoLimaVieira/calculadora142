// pacote

// bibliotecas

// classe

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;

public class TesteCalculadora {
    // atributos

    // funcoes e metodos
    @Test 
    public void testeSomar(){
        // AAA - Arrange, Act and Assert
        // CEV - Configurar, Executa e Valida

        // Arrange
        // Dados de entrada
        float num1 = 10;
        float num2 = 8;
        // Dados de Saida / resultado esperado
        float resultadoEsperado = 18;

        // Act
        float resultadoAtual = Main.somar(num1, num2);

        // Assert
        assertEquals (resultadoEsperado, resultadoAtual);

    }

    @Test 
    public void testeSubitrair(){

        float num1 = 10;
        float num2 = 8;
        float resultadoEsperado = 2;

        float resultadoAtual = Main.subtrair(num1, num2);

        assertEquals (resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeMultiplicar(){

        float num1 = 2;
        float num2 = 2;

        float resultadoEsperado = 4;

        float resultadoAtual = Main.multiplicar(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testeDividir(){
        int num1 = 27;
        int num2 = 3;
        String resultadoEsperado = "9";

        String resultadoAtual = Main.dividirTry(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
    
    @Test
    public void testeDividirPorZero(){
        int num1 = 7;
        int num2 = 0;
        String resultadoEsperado = "Não é possivel dividir por zero";

        String resultadoAtual = Main.dividirTry(num1, num2);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    // DDT: Data Driven Testing - - > teste direcionado a dados
    // Popular: Teste com Massa

    @ParameterizedTest 
    @CsvSource(value = {
        "15, 25, 40.0",
        "0, 12, 12.0",
        "-5, 9, 4.0",
        "-7,-8,-15",
        "0.5,3.7,4.2"
    }, delimiter = ',')
    public void testeSomarDDT(float num1, float num2, float resultadoEsperado){

        // AAA - Arrange  / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Os dados de entrada e o resultado esperado são lidos da massa de teste acima

        // Executa

        float resultadoAtual = Main.somar(num1, num2);

        // valida

        assertEquals (resultadoEsperado, resultadoAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/somar.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeSomarCSV(float num1, float num2, float resultadoEsperado){

        float resultadoAtual = Main.somar(num1, num2);
        assertEquals (resultadoEsperado, resultadoAtual);

    }

}
