package br.com.rafa.lolmanager.repository;

import br.com.rafa.lolmanager.model.Champion;

import java.util.ArrayList;

public interface IChampionRepository {
    Champion save(Champion champion);

    Champion getById(int id);

    public ArrayList<Champion> getList();

    boolean checkSeExiste(String nome);
}
