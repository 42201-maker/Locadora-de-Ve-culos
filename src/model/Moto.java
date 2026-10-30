package model;

import java.util.Locale;

/**
 * Moto: 15% de desconto quando o aluguel for de 5 dias ou mais.
 */
public class Moto extends Veiculo {

    public static final int DIAS_PARA_DESCONTO = 5;
    public static final double PERCENTUAL_DESCONTO = 0.15;

    public Moto(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        validarDias(dias);
        double total = getValorDiaria() * dias;
        if (dias >= DIAS_PARA_DESCONTO) {
            total -= total * PERCENTUAL_DESCONTO;
        }
        return total;
    }

    @Override
    public void mostrarResumo(int dias) {
        Locale br = Locale.forLanguageTag("pt-BR");
        double base = getValorDiaria() * dias;
        System.out.println("=== MOTO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println(String.format(br, "Diária: R$ %.2f", getValorDiaria()));
        System.out.println("Dias: " + dias);
        if (dias >= DIAS_PARA_DESCONTO) {
            System.out.println(String.format(br, "Desconto (15%%): -R$ %.2f", base * PERCENTUAL_DESCONTO));
        } else {
            System.out.println("Desconto: não aplicável (menos de 5 dias)");
        }
        System.out.println(String.format(br, "Total do aluguel: R$ %.2f", calcularAluguel(dias)));
    }
}
