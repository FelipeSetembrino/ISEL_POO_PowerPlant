package view;


import model.Cell;
import console.tile.Tile;
import model.cell_type.*;
import view.tile_type.*;


public abstract class CellTile extends Tile {
    public static final int SIDE = 3;
    protected Cell cell;

    protected CellTile(Cell cell) {
        this.cell=cell;
        setSize(SIDE, SIDE);
    }

    @Override
    public void paint() {
        //TODO:
    }

    public static Tile newInstance(Cell cell) {
        if (cell instanceof CellCasa)return new TileCasa(cell);
        else if (cell instanceof CellCurva)return new TileCurva(cell);
        else if (cell instanceof CellEspaco) return new TileEspaco(cell);
        else if (cell instanceof CellFonte) return new TileFonte(cell);
        else if (cell instanceof CellLinha) return new TileLinha(cell);
        else if (cell instanceof CellRamo) return new TileRamo(cell);
        else return null;
    }

    //TODO:
}
