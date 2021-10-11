/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ra164644
 */
class ListaProdutoTableModel extends AbstractTableModel{
    
    private List<Produto> linhas;
     /* Array de Strings com o nome das colunas. */  
    private String[] colunas = new String[] {  
                "ID", "Nome","Preço","Fabricante"};  
      
      
        /* Cria um ReciboTableModel vazio. */  
    public ListaProdutoTableModel() {  
        linhas = new ArrayList<Produto>();  
    }
             
        /* Cria um ReciboTableModel carregado com 
         * a lista de recibos especificada. */  
    public ListaProdutoTableModel(List<Produto> a) {  
        linhas = new ArrayList<Produto>(a);  
    }  
      
      
    @Override  
    public int getColumnCount() {  
            // Está retornando o tamanho do array "colunas".  
            // Mas como o array é fixo, vai sempre retornar 4.  
        return colunas.length;  
    }  
      
        /* Retorna a quantidade de linhas. */  
    @Override  
    public int getRowCount() {  
            // Retorna o tamanho da lista de recibos.  
    return linhas.size();  
        }  
    @Override
    public String getColumnName(int columnIndex) {
        // Retorna o conteúdo do Array que possui o nome das colunas  
        // no índice especificado.  
        return colunas[columnIndex];
    };
    public Class<?> getColumnClass(int columnIndex) {
            // Retorna a classe referente a coluna especificada.  
            // Aqui é feito um switch para verificar qual é a coluna  
            // e retornar o tipo adequado. As colunas são as mesmas  
            // que foram especificadas no array "colunas".  
            switch (columnIndex) {

                case 0: // ID  
                    return int.class;
                case 1: //nome
                    return String.class;
                case 2://preço
                    return float.class;
                case 3://fabricante
                    return String.class;
                
                default:
                    // Se o índice da coluna não for válido, lança um  
                    // IndexOutOfBoundsException (Exceção de índice fora dos limites).  
                    // Não foi necessário verificar se o índice da linha é inválido,  
                    // pois o próprio ArrayList lança a exceção caso seja inválido.  
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
     public Object getValueAt(int rowIndex, int columnIndex) {  
            // Pega o recibo da linha especificada.  
            Produto c = linhas.get(rowIndex);

            // Retorna o campo referente a coluna especificada.  
            // Aqui é feito um switch para verificar qual é a coluna  
            // e retornar o campo adequado. As colunas são as mesmas  
            // que foram especificadas no array "colunas".  
            switch (columnIndex) {
                case 0: //ID  
                    return  c.getId();
                case 1: //Nome
                    return c.getNome();
                case 2:
                    return c.getPreco();
                case 3:
                    return c.getNomeFabricante();
                
                default:
                    // Se o índice da coluna não for válido, lança um  
                    // IndexOutOfBoundsException (Exceção de índice fora dos limites).  
                    // Não foi necessário verificar se o índice da linha é inválido,  
                    // pois o próprio ArrayList lança a exceção caso seja inválido.  
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
     /* Seta o valor da célula especificada 
         * pelos índices da linha e da coluna. 
         * Aqui ele está implementado para não fazer nada, 
         * até porque este table model não é editável. */  
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {};  
      
        /* Retorna um valor booleano que define se a célula em questão 
         * pode ser editada ou não. 
         * Este método é utilizado pela JTable na hora de definir o editor da célula. 
         * Neste caso, estará sempre retornando false, não permitindo que nenhuma 
         * célula seja editada. */  
        public boolean isCellEditable(int rowIndex, int columnIndex) {  
            
            boolean value = false;
            
            if(columnIndex == 0){
                value = true;
            }
            
            return value;  
        }
        
    
}
