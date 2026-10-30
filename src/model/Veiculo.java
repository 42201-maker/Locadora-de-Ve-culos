package model;

/**
 * Classe abstrata que representa um veículo da locadora Estrada Livre.
 * Os atributos são privados (encapsulamento) e o acesso é feito por getters.
 */
public abstract class Veiculo {

    private final String placa;
    private final String modelo;
    private final double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        }
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio.");
        }
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero.");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    /** Valida a quantidade de dias de aluguel (reaproveitada pelas subclasses). */
    protected void validarDias(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
    }

    /** Calcula o valor total do aluguel para a quantidade de dias informada. */
    public abstract double calcularAluguel(int dias);

    /** Exibe no console o resumo do aluguel para a quantidade de dias informada. */
    public abstract void mostrarResumo(int dias);
}
