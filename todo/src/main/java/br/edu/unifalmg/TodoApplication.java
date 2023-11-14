package br.edu.unifalmg;

import br.edu.unifalmg.Repository.Chores.ChoresRepository;
import br.edu.unifalmg.Repository.Chores.impl.JsonChoreRepository;
import br.edu.unifalmg.Repository.Chores.impl.MySQLChoreRepository;
import br.edu.unifalmg.domain.Chore;
import br.edu.unifalmg.service.ChoreService;

import java.time.LocalDate;

public class TodoApplication {

    public static void main(String[] args) {
//        ChoreRepository repository = new FileChoreRepository();
        ChoresRepository repository = new MySQLChoreRepository();
        ChoreService service = new ChoreService(repository);
        service.loadChores();
//        service.addChore("Testing write on database feature", LocalDate.now());
        Chore chore = service.getChores().get(0);
        System.out.println(chore.getDescription());
        service.editChore(chore, "NOVA DESC", LocalDate.now().plusDays(4));
        service.updateChore(chore);
//        service.addChore("Chore #02", LocalDate.now().plusDays(8));
//        service.toggleChore("Chore #03", LocalDate.now().plusDays(1));
        System.out.println("Tamanho da lista de chores: " + service.getChores().size());
//        service.deleteChore("Chore #02", LocalDate.now().plusDays(8));
//        service.saveChores();
    }

}
