package com.joaos.classes;


import com.joaos.classes.veiculos.TipoCarro;
import com.joaos.classes.veiculos.Veiculo;

public class Main {

    public static void main (String [] args) {
//        System.out.println("Hello World"); // Teste 1
//        System.out.println("Meu nome é Joao Vitor"); // Teste 2

        Veiculo veiculo = new Veiculo( placa: "ABC-1010");
        veiculo.setTipoCarro(TipoCarro.MOTO);
        System.out.println(veiculo.getplaca());


    }

}

