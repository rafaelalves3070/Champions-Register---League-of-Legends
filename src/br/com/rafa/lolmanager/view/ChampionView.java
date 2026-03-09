package br.com.rafa.lolmanager.view;

import br.com.rafa.lolmanager.controller.ChampionController;
import br.com.rafa.lolmanager.model.Champion;
import br.com.rafa.lolmanager.model.ChampionClass;

import java.util.Scanner;

public class ChampionView{
    ChampionController controller = new ChampionController();
    
    public void mostrarMenu() {
        System.out.println(
            "========== MENU ===========\n" +
            "1 - cadastrar\n" +
            "2 - Atualizar campeão\n" +
            "3 - Buscar campeão por Id\n" +
            "4 - Listar campeões\n" +
            "5 - Remover campeão");
    }
    public void cadastrarCampeaoView(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o nome do campeão: ");
        String  nome = scan.nextLine();
        System.out.println("Escolha a classe do campeão ( 1: Mago. 2: Atidador. 3: Suporte 4: Tank 5: Assassino");
        int classe = scan.nextInt();
        System.out.println("Escolha o dano base do campeão: ");
        int danoBase = scan.nextInt();
        System.out.println("Escolha a vida base do campeão: ");
        int vidaBase = scan.nextInt();
        System.out.println("Escolha a dificuldade do campeão");
        int dificuldade = scan.nextInt();
        
        var champion = controller.criarChampion(nome, classe, danoBase, vidaBase, dificuldade);
        System.out.println(champion);
    }
}
