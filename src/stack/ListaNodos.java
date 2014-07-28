/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author William
 */
public class ListaNodos {
    NodoPostfix Cabeza;
    NodoPostfix NodoActual;
    
public void ListaNodos(){
    NodoActual = Cabeza;
}
    
public void Push(String valor)
{
    NodoPostfix _newNodoPropio = new NodoPostfix(valor);

    if (Cabeza == null){
        Cabeza = _newNodoPropio;
        
    }
    else{
        NodoActual = _newNodoPropio;
        NodoActual.setNext(Cabeza);
        Cabeza = _newNodoPropio;
        
        
    }
}

public String Pop()
{
    String valor = Cabeza.getValue();
    Cabeza = Cabeza.getNext();
    return valor;
}

public String toString(){
    NodoPostfix Inicio = Cabeza;
    String strLista = "";
    StringBuilder _sb = new    StringBuilder();
    
    if (Inicio != null){        
        while (Inicio.getNext() != null)
        {
            _sb.append(Inicio.getValue());
            _sb.append(" ");            
            Inicio = Inicio.getNext();
        }
    }
    
    _sb.append(" null");
    
    return _sb.toString();
}

}
