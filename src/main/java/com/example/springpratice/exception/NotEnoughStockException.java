package com.example.springpratice.exception;

/**
 * @author jhkim
 * @since 2022/09/17
 */
public class NotEnoughStockException extends RuntimeException{
    public NotEnoughStockException() {
    }

    public NotEnoughStockException(String message) {
        super(message);
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }

}
