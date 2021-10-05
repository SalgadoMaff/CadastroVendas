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
public class ListaFabricanteTableModel extends AbstractTableModel{
    /* Lista de recibos que representam as linhas. */  
        private List<Fabricante> linhas;  
      
        /* Array de Strings com o nome das colunas. */  
        private String[] colunas = new String[] {  
                "ID", "Nome","CNPJ","Telefone","Estado", "Municipio", "Rua","Numero","CEP"};  
      
      
        /* Cria um ReciboTableModel vazio. */  
        public ListaFabricanteTableModel() {  
            linhas = new ArrayList<Fabricante>();  
        }
             
        /* Cria um ReciboTableModel carregado com 
         * a lista de recibos especificada. */  
        public ListaFabricanteTableModel(List<Fabricante> a) {  
            linhas = new ArrayList<Fabricante>(a);  
        }  
      
      
        /* Retorna a quantidade de colunas. */  
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
      
        /*
         * Retorna o nome da coluna no índice especificado. Este método é usado
         * pela JTable para saber o texto do cabeçalho.
         */
        @Override
        public String getColumnName(int columnIndex) {
            // Retorna o conteúdo do Array que possui o nome das colunas  
            // no índice especificado.  
            return colunas[columnIndex];
        };  
      
        /* Retorna a classe dos elementos da coluna especificada. 
         * Este método é usado pela JTable na hora de definir o editor da célula. */  
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
                case 2://cnpj
                    return String.class;
                case 3://telefone
                    return String.class;
                case 4://estado
                    return String.class;
                case 5://municipio
                    return String.class;
                case 6://rua
                    return String.class;
                case 7://numero
                    return int.class;
                case 8://cep
                    return String.class;

                default:
                    // Se o índice da coluna não for válido, lança um  
                    // IndexOutOfBoundsException (Exceção de índice fora dos limites).  
                    // Não foi necessário verificar se o índice da linha é inválido,  
                    // pois o próprio ArrayList lança a exceção caso seja inválido.  
                    throw new IndexOutOfBoundsException("columnIndex out of bounds");
            }
        }
      
        /* Retorna o valor da célula especificada 
         * pelos índices da linha e da coluna. */  
        public Object getValueAt(int rowIndex, int columnIndex) {  
            // Pega o recibo da linha especificada.  
            Fabricante c = linhas.get(rowIndex);

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
                    return c.getCNPJ();
                case 3:
                    return c.getTelefone();
                case 4:
                    return c.getEstado();
                case 5:
                    return c.getMunicipio();
                case 6:
                    return c.getRua();
                case 7:
                    return c.getNumero();
                case 8:
                    return c.getCEP();
                    
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
              
        ////////////////////////////////////////////////////////////  
        // Os métodos declarados até aqui foram as implementações //  
        // de TableModel, que são continuamente utilizados        //  
        // pela JTable para definir seu comportamento,            //  
        // por isso o nome Table Model (Modelo da Tabela).        //  
        //                                                        //  
        // A partir de agora, os métodos criados serão            //  
        // particulares desta classe.                             //  
        ////////////////////////////////////////////////////////////  
      
      
       /* Retorna o recibo da linha especificada. */  
          
        /* Adiciona um registro. */  
        public void addCliente(Fabricante fab) {  
            // Adiciona o registro.  
            linhas.add(fab);  
      
            // Pega a quantidade de registros e subtrai um para achar  
            // o último índice. É preciso subtrair um, pois os índices  
            // começam pelo zero.  
            int ultimoIndice = getRowCount() - 1;  
      
            // Reporta a mudança. O JTable recebe a notificação  
            // e se redesenha permitindo que visualizemos a atualização.  
            fireTableRowsInserted(ultimoIndice, ultimoIndice);  
        }  
      
        /* Remove a linha especificada. */  
        public void removeCliente(int indiceLinha) {  
            // Remove o recibo da linha especificada.          
            linhas.remove(indiceLinha);  
      
            // Reporta a mudança. O JTable recebe a notificação  
            // e se redesenha permitindo que visualizemos a atualização.  
            fireTableRowsDeleted(indiceLinha, indiceLinha);  
        }  
      
        /* Adiciona uma lista de recibos ao final dos registros. */  
        public void addLista(List<Fabricante> fab) {  
            // Pega o tamanho antigo da tabela.  
            int tamanhoAntigo = getRowCount();  
      
            // Adiciona os registros.  
            linhas.addAll(fab);  
      
            // Reporta a mudança. O JTable recebe a notificação  
            // e se redesenha permitindo que visualizemos a atualização.  
            fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
        }  
      
        /* Remove todos os registros. */  
        public void limpar() {  
            // Remove todos os elementos da lista de recibos.  
            linhas.clear();  
      
            // Reporta a mudança. O JTable recebe a notificação  
            // e se redesenha permitindo que visualizemos a atualização.  
            fireTableDataChanged();  
        }  
      
        /* Verifica se este table model está vazio. */  
        public boolean isEmpty() {  
            return linhas.isEmpty();  
        }  
      
    }  




