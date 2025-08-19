/* Em uma indústria, foram coletados os dados de consumo elétrico (em kWh) de 10 setores. O setor de engenharia
 * deseja identificar quantos setores apresentam consumo anômalo
 */

package Aula_1;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double [] consumos = new double[5];      //vetor criado
        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Consumo %d: ", (i + 1));
            consumos [i] = entrada.nextDouble();
        }

        int qtde = 0;
        for (double consumo : consumos) {   //cria uma variável consumo para armazenar cada conteúdo do índice de consumos
            if (consumo > 5000) {
                System.out.printf("Consumo anômalo: %.1f\n", consumo);
                qtde++;
            }
        }
        System.out.printf("Quantidade de consumo anômalo: %d\n", qtde);
    }
}
