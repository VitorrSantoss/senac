public class SenacJava {
    public static void main(String[] args) {

        System.out.println("DESAFIO 1 -> Conversa sobre café");
        String nome = "Carla";
        int idade = 27;
        String bebida = "Café";
        System.out.printf("Está é %s, ela tem %d anos e adora tomar %s no café da manhã!\n", nome, idade, bebida);


        System.out.println("DESAFIO 2 -> Contenção de mercado");
        double prod1 = 11.50;
        double prod2 = 11.50;
        double prod3 = 11.50;
        double calculo = prod1 + prod2 + prod3;
        System.out.println("A compra total foi de R$ " + calculo);


        System.out.println("DESAFIO 3 -> Tempo de leitura");
        String nomeLivro = "Poeira em Alto Mar";
        int numPag = 1000;
        int qtdDias = numPag/10;
        System.out.printf("Ao ler %s, você terminará em %d dias\n", nomeLivro, qtdDias);


        System.out.println("DESAFIO 4 -> Lista de reprodução");
        String listaReproducao = "Albúm History";
        int qtdMusica = 10;
        double tempoMedio = 3.25;
        double conta = qtdMusica * tempoMedio;

        System.out.printf("A playlist %s tem %d musicas e durará cerca de %.0f minutos\n", listaReproducao, qtdMusica, conta);


        System.out.println("DESAFIO 5 -> Objetivo do passo");
        int passos1 = 6400;
        int objeto = 10000 - passos1;
        System.out.printf("Você já deu  %d passos. Faltam %d para atingir sua meta", passos1, objeto);

    }
}
