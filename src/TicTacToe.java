public class TicTacToe {
    private final int size;
    private final Cell[][] board;

    public TicTacToe(int size) {
        this.size = size;
        this.board = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("-------------\n");
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.print("|\n");
        }
        System.out.print("-------------\n");
    }
}