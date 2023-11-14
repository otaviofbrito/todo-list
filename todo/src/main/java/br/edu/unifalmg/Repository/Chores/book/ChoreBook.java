package br.edu.unifalmg.Repository.Chores.book;

public class ChoreBook {
    public static final String FIND_ALL_CHORES = "SELECT * FROM tododb.chore";

    public static final String INSERT_CHORE = "INSERT INTO tododb.chore (`description`, `isCompleted`, `deadline`) VALUES (?,?,?)";

}
