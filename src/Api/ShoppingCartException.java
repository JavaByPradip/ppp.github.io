/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api;

/**
 *
 * @author Ajay
 */
public class ShoppingCartException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShoppingCartException()
    {
    }

    public ShoppingCartException(String message)
    {
        super(message);
    }
}