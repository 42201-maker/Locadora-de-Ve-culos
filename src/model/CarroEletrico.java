package model;

import java.util.Locale;

/**
 * Carro elétrico: herda de Carro (inclui o seguro de 10%), soma R$ 15,00 por dia
 * de taxa de bateria e implementa Recarregavel (R$ 0,80 por kWh).
 */
public class CarroEletrico extends Carro implements Recarregavel {

    public static final double TAXA_BATERIA_DIARIA = 15.00;
    public static final double CUSTO_POR_KWH = 0.80;

    public CarroEletrico(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        // super.calcularAluguel já valida os dias e aplica o seguro de 10%
        return super.calcularAluguel(dias) + (TAXA_BATERIA_DIARIA * dias);
    }

    @Override
    public double calcularCustoRecarga(double kWh) {
        if (kWh < 0) {
            throw new IllegalArgumentException("O consumo em kWh não pode ser negativo.");
        }
        return kWh * CUSTO_POR_KWH;
    }

    @Override
    public void mostrarResumo(int dias) {
        Locale br = Locale.forLanguageTag("pt-BR");
        double base = getValorDiaria() * dias;
        System.out.println("=== CARRO ELÉTRICO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println(String.format(br, "Diária: R$ %.2f", getValorDiaria()));
        System.out.println("Dias: " + dias);
        System.out.println(String.format(br, "Seguro (10%%): R$ %.2f", base * PERCENTUAL_SEGURO));
        System.out.println(String.format(br, "Taxa de bateria (R$ 15,00/dia): R$ %.2f", TAXA_BATERIA_DIARIA * dias));
        System.out.println(String.format(br, "Total do aluguel: R$ %.2f", calcularAluguel(dias)));
    }
}
