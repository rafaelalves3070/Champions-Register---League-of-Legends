package br.com.rafa.lolmanager.repository;

import br.com.rafa.lolmanager.model.Champion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ChampionRepository implements IChampionRepository {

    private static Map<Integer, Champion> database = new HashMap<>();

    private static int nextId = 0;

    public Champion save(Champion champion) {
        champion.setId(nextId);
        database.put(nextId,champion);
        nextId++;
        return champion;
    }

    public Champion getById(int id) {
        return database.get(id);
    }

    public ArrayList<Champion> getList() {
        var championList = new ArrayList<Champion>();
        database.forEach((c,v) -> championList.add(v));
        return championList.stream()
                .sorted(Comparator.comparing(Champion::getId))
                .collect(java.util.stream.Collectors.toCollection(ArrayList::new));
    }

    public Champion atualizarCampeao(Champion champion){
        database.replace(champion.getId(), champion);
        return database.get(champion.getId());
    }

    public boolean checkSeExiste(String nome){
        return database.values()
                .stream()
                .anyMatch(c -> c.getNome().equals(nome));
    }
}
