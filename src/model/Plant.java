package model;

import ctrl.Game;

public class Plant {
    private Cell[][] map;
    private int Cell_rotate[][];
    private int height, width;


    //Cria o mapa com as Cells
    public Plant(int height, int width) {
        map = new Cell[height][width];
        this.height = height;
        this.width = width;
    }

    //Enviando a altura e comprimento das quantidades de células
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    //Insere o valor de cada Cell no arquivo txt no map
    public void putCell(int l, int i, Cell cell) {
        map[l][i] = cell;
    }

    //inicialização aleatoria de rotação das Cells
    //1 inicia-se conforme o "Tipo Célula.PNG" original, a partir dai rotaciona-se sentifo horário
    public void init(int l, int i) {
        Cell_rotate[l][i] = (int)(Math.random() * 1+4);
    }

    public Cell getCell(int l, int c) {
        return map[l][c];
    }

    //Processo de funções com Listener
    public interface Listener {
        void cellChanged(int lin, int col, Cell cell);
    }

    private Listener listener = null;
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    //TODO:
 }
