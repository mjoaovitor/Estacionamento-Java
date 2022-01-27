package com.joaos.classes.veiculos;

import java.time.LocalDateTime;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private double totalEstacionamento;
    private TipoCarro tipoCarro;

    public Veiculo(String Placa) {
        this.placa = Placa;
    }
    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
}
