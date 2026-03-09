package br.com.rafa.lolmanager.controller;

import br.com.rafa.lolmanager.model.Champion;
import br.com.rafa.lolmanager.model.ChampionClass;
import br.com.rafa.lolmanager.repository.IChampionRepository;
import br.com.rafa.lolmanager.service.ChampionService;

public class ChampionController {
    ChampionService service = new ChampionService();
    IChampionRepository repository;

    public Champion criarChampion(
            String nome,
            int classe,
            int danoBase,
            int vidaBase,
            int dificuldade
    ) {
        ChampionClass championClasse = ChampionClass.fromValor(classe);

        Champion champion = new Champion(nome, championClasse, danoBase, vidaBase, dificuldade);
        service.validade(champion);
        return repository.save(champion);
    }
}
