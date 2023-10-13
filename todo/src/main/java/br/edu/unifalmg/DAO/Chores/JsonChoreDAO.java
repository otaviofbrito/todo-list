
package br.edu.unifalmg.DAO.Chores;

import br.edu.unifalmg.DAO.Chores.ChoresDAO;
import br.edu.unifalmg.domain.Chore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonChoreDAO implements ChoresDAO {

    public static final String PATH = "/home/otavio/Documents/unifal/gestaocv/todo-list/todo/src/Data/chores.json";
    public List<Chore> readChores(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        try {
            return objectMapper.readValue(new File(PATH),
                    new TypeReference<List<Chore>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}