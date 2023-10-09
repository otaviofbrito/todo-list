package br.edu.unifalmg.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ToggleChoreWithInvalidDeadlineException extends RuntimeException {

    public ToggleChoreWithInvalidDeadlineException(String message) {
        super(message);
    }

}
