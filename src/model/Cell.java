package model;


import model.cell_type.*;

public abstract class Cell {
    protected static Plant model;

    //Verificando o char, primeira letra, e instanciando a cell conforme o tipo. cell é um objeto.
    public static Cell newInstance(char type) {
        Cell cell = null;

        if (type == 'P'){
            cell = new CellFonte();
        }
        if (type == 'H'){
            cell = new CellCasa();
        }
        if (type == '-'){
            cell = new CellLinha();
        }
        if (type == 'c'){
            cell = new CellCurva();
        }
        if (type == 'T'){
            cell = new CellRamo();
        }
        if (type == '.'){
            cell = new CellRamo();
        }
        return cell;
    }

    //TODO:
}
