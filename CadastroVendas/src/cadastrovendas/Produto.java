/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;

/**
 *
 * @author ra164644
 */
public class Produto  {
    int id;
    String Nome;
    Integer qtd;
    Float preco;
    String NomeFabricante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNomeFabricante() {
        return NomeFabricante;
    }

    public void setNomeFabricante(String NomeFabricante) {
        this.NomeFabricante = NomeFabricante;
    }
    
    public boolean isNull(){
        if (this.Nome.isEmpty()||this.NomeFabricante.isEmpty()||this.preco==null||this.qtd==null) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

  
}
