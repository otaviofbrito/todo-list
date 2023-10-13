package br.edu.unifalmg.DAO.Chores;

import br.edu.unifalmg.domain.Chore;

import java.util.List;

public interface ChoresDAO {
    public List<Chore> readChores();
}