
package br.edu.unifalmg.Repository.Chores;

import br.edu.unifalmg.domain.Chore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonChoreRepository implements ChoresRepository {

    ObjectMapper objectMapper;

    public JsonChoreRepository(){
        objectMapper = new ObjectMapper().findAndRegisterModules();
    }

    @Override
    public List<Chore> load(){
        try {
            return objectMapper.readValue(new File("chores.json"),
                    new TypeReference<List<Chore>>(){});
        } catch (MismatchedInputException exception) {
            System.out.println("Unable to convert the content of the file into Chores!");
        } catch (IOException exception){
            System.out.println("ERROR: Unable to open file.");
        }

        return new ArrayList<>();
    }
}