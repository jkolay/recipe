package com.abnamro.recipe.exception;

import org.springframework.http.HttpStatus;

public class IngredientNotFoundException extends RuntimeException implements CustomRecipeException {

    private HttpStatus status = HttpStatus.NOT_FOUND;

    public IngredientNotFoundException() {
        super();
    }

    public IngredientNotFoundException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public IngredientNotFoundException(String message) {
        super(message);
    }

    public IngredientNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public IngredientNotFoundException(Throwable cause) {

        super(cause);
    }

    protected IngredientNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public HttpStatus getStatus() {

        return status;
    }
}
