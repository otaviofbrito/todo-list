package br.edu.unifalmg.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidDescriptionException extends RuntimeException {

    public InvalidDescriptionException(String message) {
        super(message);
    }

}
