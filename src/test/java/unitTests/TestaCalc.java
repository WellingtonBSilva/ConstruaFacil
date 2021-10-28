package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {

    @Test
    public void testarSomarDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

         // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e: " + resultadoEsperado + "\n O resultado Atual e: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarSubtrairDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 10;
        int num2 = 7;
        int resultadoEsperado = 3;

        // 2 - Executar - When
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e: " + resultadoEsperado + "\n O resultado Atual e: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarMultiplicarDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        int num1 = 5;
        int num2 = 6;
        int resultadoEsperado = 30;

        // 2 - Executar - When
        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e: " + resultadoEsperado + "\n O resultado Atual e: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarDividirDoisNumeros(){
        // 1 - Prepara - Configurar - Given
        double num1 = 9;
        double num2 = 2;
        double resultadoEsperado = 4.5;

        // 2 - Executar - When
        double resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e: " + resultadoEsperado + "\n O resultado Atual e: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }
}
