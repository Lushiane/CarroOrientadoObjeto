import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Carro novoCarro = new Carro();
        int opcao = 0;

        //System.out.print("A cor do carro é : ");
       //System.out.println(novoCarro.getCor());
        //System.out.println("----------------------------------");

        //Ações

        do {
            System.out.println("Programa o carro dos seus sonhos");
            System.out.println(" ______________________________________");
            System.out.println("|       Selecione 1 - para cor         |");
            System.out.println("|______________________________________|");
            System.out.println("|    2 - para ano de fabricação        |");
            System.out.println("|______________________________________|");
            System.out.println("|    3 - para quantidade de portas     |");
            System.out.println("|______________________________________|");
            System.out.println("|    4 - para combustível              |");
            System.out.println("|______________________________________|");
            System.out.println("|    5 - para marca                    |");
            System.out.println("|______________________________________|");
            System.out.println("|    7 - para assentos                 |");
            System.out.println("|______________________________________|");
            System.out.println("|    8 - para sair                     |");
            System.out.println("|______________________________________|");
            opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Selecione a cor desejada");
                novoCarro.setCor(leitor.next());
                System.out.println("A cor selecionada foi: " + novoCarro.getCor());
                System.out.println("___________________________________");
            break;

            case 2:
                System.out.println("Insira o ano de fabricação:");
                novoCarro.setAnoFabricacao(leitor.nextInt());
                System.out.println("O ano do carro: " + novoCarro.getAnoFabricacao());
            break;

            case 3:
                System.out.println("Insira a quantidade portas");
                novoCarro.setQtdPortas(leitor.nextInt());
                System.out.println("O ano do carro: " + novoCarro.GetQtdPortas());
            break;

            case 4:
            System.out.println("Insira o tipo de combustível:");
            novoCarro.setCombustivel(leitor.next());
            System.out.println("O tipo de combustível foi: " + novoCarro.getCombustivel());
            break;

            case 5:
            System.out.println("Insira a marca:");
            novoCarro.setMarca(leitor.next());
            System.out.println("O tipo de combustível foi: " + novoCarro.GetMarca());
            break;

            case 6:
            System.out.println("Insira a quantidades de assentos:");
            novoCarro.setAssentos(leitor.nextInt());
            System.out.println("A quantidade de assentos escolhidos foi: " + novoCarro.getAssentos());
            break;

            default: System.out.print("Opcao invalida");

        }

        } while (opcao != 8);
    } 
}
