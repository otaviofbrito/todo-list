package br.edu.unifalmg.Repository.Chores.book;

public class ChoreBook {
    public static final String FIND_ALL_CHORES = "SELECT * FROM db.chore";

    public static final String INSERT_CHORE = "INSERT INTO db.chore (`description`, `isCompleted`, `deadline`) VALUES (?,?,?)";

}
