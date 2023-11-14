package br.edu.unifalmg;

import br.edu.unifalmg.Repository.Chores.ChoresRepository;
import br.edu.unifalmg.Repository.Chores.impl.JsonChoreRepository;
import br.edu.unifalmg.service.ChoreService;

import java.time.LocalDate;

public class TodoApplication {

    public static void main(String[] args) {

        ChoresRepository repository = new JsonChoreRepository();
        ChoreService service = new ChoreService(repository);
        service.addChore("avasdasdasdas", LocalDate.now());
        service.saveChores();
        System.out.println("Tamanho da lista de chores: " + service.getChores().size());

    }

}
