package com.joaos.classes;


import com.joaos.classes.veiculos.TipoCarro;
import com.joaos.classes.veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args) {
//        System.out.println("Hello World"); // Teste 1
//        System.out.println("Meu nome é Joao Vitor"); // Teste 2

        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo veiculo = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();

        veiculo.setTipoCarro(TipoCarro.MOTO);
        veiculo.setPlaca("213321");

        veiculo2.setTipoCarro(TipoCarro.CARRO);
        veiculo2.setPlaca("kkkkkkk");

        veiculo3.setTipoCarro(TipoCarro.UTILITARIO);
        veiculo3.setPlaca("1asdasda");

        veiculos.add(veiculo);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);

        System.out.println("Qual o tamanho da Lista?? "+ veiculos.size());
        veiculos.forEach(v->System.out.println(veiculo.getPlaca()+" "+veiculo.getTipoCarro()));






    }

}

