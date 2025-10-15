public class Board {
    private final int size;
    private Cell[][] cells;

    public Board(int size) {
        this.size = size;
        this.cells = new Cell[size][size];
        generateBoard();
    }

    private void generateBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return size*size;
    }

    public Cell getCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IndexOutOfBoundsException("Coordonnées en dehors du plateau !");
        }
        return cells[row][col];
    }
}
