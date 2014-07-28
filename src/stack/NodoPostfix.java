/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author William
 */
public class NodoPostfix {
    private String _value;
	private NodoPostfix _next;

	


	public NodoPostfix()
	{
		_value = "";
		_next = null;
	}


	public NodoPostfix(String valor)
	{
		_value = valor;
		_next = null;
	}

	public NodoPostfix(String valor, NodoPostfix siguiente)
	{
		_value = valor;
		_next = siguiente;
	}

	public void setValue(String valor)
	{
    	this._value = valor;
	}


	public void setNext(NodoPostfix siguiente)
	{
    	_next =  siguiente;
	}

	public String getValue()
	{
    	return _value;
	}


	public NodoPostfix getNext()
	{
    	return _next;
	}


}
