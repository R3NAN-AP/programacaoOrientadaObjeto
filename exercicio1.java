/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introducao;



/**
 *
 * @author aluno
 */
public class exercicio1 {
          private static class TestaCachorro {

        private char sexo;
        private String cor;
        private String cordoOlhos;
        private int idade;
        private int peso;

    }
    public static void main(String[] args) {
        TestaCachorro bella = new TestaCachorro();
        bella.sexo = 'F';
        bella.cor = "preto";
        bella.cordoOlhos = "preto";
        bella.idade = 9;
        bella.peso = 30;
        
        TestaCachorro meg = new TestaCachorro();
        meg.sexo = 'F';
        meg.cor = "amarela";
        meg.cordoOlhos = "castanho";
        meg.idade = 10;
        meg.peso = 50;
        
        TestaCachorro lobo = new TestaCachorro();
        lobo.sexo = 'M';
        lobo.cor = "marrom";
        lobo.cordoOlhos = "preto";
        lobo.idade = 6;
        lobo.peso = 60;
        
        TestaCachorro rex = new TestaCachorro();
        rex.sexo = 'M';
        rex.cor = "cinza";
        rex.cordoOlhos = "azul";
        rex.idade = 8;
        rex.peso = 80;
        
        TestaCachorro alan = new TestaCachorro();
        alan.sexo = 'M';
        alan.cor = "amarelo";
        alan.cordoOlhos = "preto";
        alan.idade = 30;
        alan.peso = 50;
    }
  }


