package model;

import java.util.Locale;

/**
 * Carro: aluguel com 10% de seguro sobre o valor total.
 */
public class Carro extends Veiculo {

    public static final double PERCENTUAL_SEGURO = 0.10;

    public Carro(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        validarDias(dias);
        double total = getValorDiaria() * dias;
        return total + (total * PERCENTUAL_SEGURO);
    }

    @Override
    public void mostrarResumo(int dias) {
        Locale br = Locale.forLanguageTag("pt-BR");
        double base = getValorDiaria() * dias;
        System.out.println("=== CARRO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println(String.format(br, "Diária: R$ %.2f", getValorDiaria()));
        System.out.println("Dias: " + dias);
        System.out.println(String.format(br, "Seguro (10%%): R$ %.2f", base * PERCENTUAL_SEGURO));
        System.out.println(String.format(br, "Total do aluguel: R$ %.2f", calcularAluguel(dias)));
    }
}
