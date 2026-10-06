public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                2024,
                150.00,
                4
        );

        Motocicleta moto = new Motocicleta(
                "Honda",
                "CB 500",
                2023,
                100.00,
                500
        );

        carro.exibirInformacoes();
        System.out.println();

        moto.exibirInformacoes();
        System.out.println();

        Veiculo veiculo1 = carro;
        Veiculo veiculo2 = moto;

        veiculo1.exibirInformacoes();
        System.out.println();

        veiculo2.exibirInformacoes();
        System.out.println();


        System.out.println("Diário do carro: R$ " + veiculo1.calcularDiaria());
        System.out.println("\nDiário da motocicleta: R$ " + veiculo2.calcularDiaria());

        System.out.println("\nValor do aluguel por 5 dias: " + carro.calcularDiaria(5));

        carro.setValorDiaria(180.00);
        System.out.println();

        System.out.println("Nova diária do carro: R$ " + carro.getValorDiaria());
    }

}
