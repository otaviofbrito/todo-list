package br.edu.unifalmg;

import br.edu.unifalmg.Repository.Chores.ChoresRepository;
import br.edu.unifalmg.Repository.Chores.JsonChoreRepository;
import br.edu.unifalmg.service.ChoreService;

public class TodoApplication {

    public static void main(String[] args) {

        ChoresRepository repository = new JsonChoreRepository();
        ChoreService service = new ChoreService(repository);
        service.loadChores();
        System.out.println("Tamanho da lista de chores: " + service.getChores().size());

    }

}
