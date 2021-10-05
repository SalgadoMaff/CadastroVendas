/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;

import java.util.ArrayList;

/**
 *
 * @author ra164644
 */
public class Venda {
    int id;
    ArrayList<Produto> lista;
    float valortotal;
    Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Produto> getLista() {
        return lista;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
