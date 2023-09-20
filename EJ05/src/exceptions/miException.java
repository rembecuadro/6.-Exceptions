package exceptions;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author rembe
 */
public class miException extends Exception {

    /**
     * Creates a new instance of <code>miException</code> without detail
     * message.
     */
    public miException() {
    }

    /**
     * Constructs an instance of <code>miException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public miException(String msg) {
        super(msg);
    }
}
