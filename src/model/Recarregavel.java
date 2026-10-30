package model;

/**
 * Contrato para veículos que podem ser recarregados.
 */
public interface Recarregavel {

    /**
     * Calcula o custo da recarga.
     *
     * @param kWh quantidade de energia consumida, em quilowatts-hora
     * @return custo total da recarga em reais
     */
    double calcularCustoRecarga(double kWh);
}
