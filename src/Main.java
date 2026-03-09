import br.com.rafa.lolmanager.view.ChampionView;

import java.util.Scanner;

public class Main{

    Scanner scan = new Scanner(System.in);
    ChampionView view = new ChampionView();
    public void main() {
        view.mostrarMenu();

        System.out.println("Escolha uma opção. ");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                view.cadastrarCampeaoView();
                break;
            case 2:
                break;
            case 3:

                break;
            default:

                break;
        }
    }
}