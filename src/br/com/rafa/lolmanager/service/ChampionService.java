package br.com.rafa.lolmanager.service;

import br.com.rafa.lolmanager.model.Champion;
import br.com.rafa.lolmanager.model.ChampionClass;
import br.com.rafa.lolmanager.repository.ChampionRepository;
import br.com.rafa.lolmanager.repository.IChampionRepository;

public class ChampionService {
    IChampionRepository repository;
    public void validade(Champion champion) {

        if(champion == null)
            throw new RuntimeException("O campeão não pode ser vázio");

        if(champion.getNome() == null || champion.getNome().isEmpty())
            throw new RuntimeException("O nome do campeão deve ser fornecido.");

        if(champion.getDanoBase() < 0)
            throw new RuntimeException("Dano base não pode ser nulo");

        if(champion.getVidaBase() < 0)
            throw new RuntimeException("Vida base não pode ser nulo");

        if(champion.getDificuldade() < 1 || champion.getDificuldade() > 5)
            throw new RuntimeException("Dificuldade tem que estar entre 1 e 5");

        if(champion.getClasse() == ChampionClass.MAGO && champion.getDanoBase() < 50)
            throw new RuntimeException("Dano base do mago tem que ser maior que 50. ");

        if(champion.getClasse() == ChampionClass.TANK && champion.getVidaBase() < 500)
            throw new RuntimeException("Vida base do tank tem que ser maior que 500. ");

        if(repository.checkSeExiste(champion.getNome()))
            throw new RuntimeException("Nome de campeão já cadastrado. ");
    }

}
