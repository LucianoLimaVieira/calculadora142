package com.iterasys; // pacote

// 2 - classe
public class Main {
    // 1.1 Atributos

    // 2.2 Metodos e Funções
    public static void main(String[] args) {
        System.out.println("Hello world!");
       // float resultado = somar(5, 7);
       // System.out.println("A soma de 5 + 7 = " + resultado);
    }

    public static float somar(float num1, float num2) {
        float resultado = num1 + num2;
        System.out.println("Soma de " + num1 + " + " + num2 + " = " + resultado);
        return resultado;
    }

    public static float subtrair(float num1, float num2) {
        float resultado = num1 - num2;
        System.out.println("Subtração de " + num1 + " - " + num2 + " = " + resultado);
        return resultado;
    }

    public static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    public static float dividirIf(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não é possivel dividir por zero");
            return 0;
        }
    }

    public static String dividirTry(int num1, int num2){
        try {
            return String.valueOf(num1 / num2);
        } catch (Exception e) {
            return "Não é possivel dividir por zero";// TODO: handle exception
        }
    }

}