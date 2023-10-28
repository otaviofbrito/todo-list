
package br.edu.unifalmg.Repository.Chores;

import br.edu.unifalmg.domain.Chore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonChoreRepository implements ChoresRepository {

    private ObjectMapper mapper;

    public JsonChoreRepository() {
        mapper = new ObjectMapper().findAndRegisterModules();
    }

    @Override
    public List<Chore> load() {
        try {
            return new ArrayList<>(
                    Arrays.asList(
                            mapper.readValue(new File("chores.json"), Chore[].class)
                    )
            );


        } catch(MismatchedInputException exception) {
            System.out.println("Unable to convert the content of the file into Chores!");
        } catch(IOException exception) {
            System.out.println("ERROR: Unable to open file.");
        }
        return new ArrayList<>();
    }

    @Override
    public boolean save(List<Chore> chores) {
        try {
            mapper.writeValue(new File("chores.json"), chores);
            return true;
        } catch (IOException exception) {
            System.out.println("ERROR: Unable to write the chores on the file.");
        }
        return false;
    }
}