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
public class Cliente extends Endereco{
    Integer id;
    String Nome;
    String CPF;
    String telefone;

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isNull() {
        if (this.CEP.isEmpty() || this.CPF.isEmpty() || this.Estado.isEmpty() || this.Municipio.isEmpty() || this.Nome.isEmpty() || this.Numero==null || this.Rua.isEmpty() || this.telefone.isEmpty()) {
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }
    
    
}
