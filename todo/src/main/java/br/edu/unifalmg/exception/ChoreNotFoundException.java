package br.edu.unifalmg.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ChoreNotFoundException extends RuntimeException {

    public ChoreNotFoundException(String message) {
        super(message);
    }

}
