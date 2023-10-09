package br.edu.unifalmg.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmptyChoreListException extends RuntimeException {

    public EmptyChoreListException(String message) {
        super(message);
    }

}
