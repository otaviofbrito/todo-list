package br.edu.unifalmg.Repository.Chores;

import br.edu.unifalmg.domain.Chore;

import java.util.List;

public interface ChoresRepository {
    public List<Chore> load();

    boolean save(List<Chore> chores);

}