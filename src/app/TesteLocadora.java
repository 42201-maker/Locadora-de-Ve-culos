package app;

import java.util.Locale;

import model.Carro;
import model.CarroEletrico;
import model.Moto;
import model.Recarregavel;
import model.Veiculo;

/**
 * Classe de teste da locadora Estrada Livre.
 * Demonstra herança, polimorfismo, classe abstrata e interface.
 */
public class TesteLocadora {

    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");

        System.out.println("##### LOCADORA ESTRADA LIVRE #####\n");

        // Polimorfismo: todos os objetos são tratados como Veiculo
        Veiculo[] frota = {
            new Carro("ABC-1234", "Fiat Argo", 150.00),
            new Moto("MOT-5678", "Honda CG 160", 80.00),
            new Moto("MOT-9012", "Yamaha Fazer 250", 100.00),
            new CarroEletrico("ELE-3456", "BYD Dolphin", 220.00)
        };
        int[] dias = {3, 3, 7, 4};

        for (int i = 0; i < frota.length; i++) {
            frota[i].mostrarResumo(dias[i]);

            // Interface: só veículos Recarregavel têm custo de recarga
            if (frota[i] instanceof Recarregavel) {
                Recarregavel r = (Recarregavel) frota[i];
                double kWh = 40.0;
                System.out.println(String.format(br,
                        "Recarga de %.1f kWh: R$ %.2f", kWh, r.calcularCustoRecarga(kWh)));
            }
            System.out.println();
        }

        // Total da frota alugada
        double soma = 0;
        for (int i = 0; i < frota.length; i++) {
            soma += frota[i].calcularAluguel(dias[i]);
        }
        System.out.println(String.format(br, "Faturamento total dos aluguéis: R$ %.2f", soma));

        // Testes de validação
        System.out.println("\n--- Teste de validação ---");
        try {
            frota[0].calcularAluguel(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
