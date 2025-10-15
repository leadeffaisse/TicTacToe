import java.util.Scanner;

public class TicTacToe {
    private final Board board;
    private Player player1;
    private final Scanner scanner;

    public TicTacToe(int size) {
        this.board = new Board(3);
        this.scanner = new Scanner(System.in);
        this.player1 = new Player("O", 1);
    }

    public void display() {
        for (int i = 0; i < board.getSize(); i++) {
            System.out.println("-------------");
            for (int j = 0; j < board.getSize(); j++) {
                System.out.print("|");
                System.out.print(board.getCell(i, j).getRepresentation());
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public int[] getMoveFromPlayer(Player player) {
        int[] move = new int[2];
        int row;
        int col;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println("Tour du joueur " + player.getRepresentation());
                System.out.println("Veuillez saisir les coordonnées de la case à capturer (de 1 à 3).");
                System.out.print("Ligne :");
                row = scanner.nextInt() - 1;

                System.out.print("Colonne :");
                col = scanner.nextInt() - 1;

                if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
                    System.out.println("Erreur : les coordonnées doivent être comprises entre 1 et 3");
                    continue;
                }

                if (!board.getCell(row, col).isFree()) {
                    System.out.println("Erreur : cette case est déjà occupée. Choississez une autre case.");
                    continue;
                }
                move[0] = row;
                move[1] = col;
                takeCell(row, col, player);
                isValid = true;

            } catch (Exception e) {
                System.out.println("Erreur : vous devez rentrer des nombres entiers.");
                scanner.nextLine();
            }
        }
        return move;
    }

    public void takeCell(int row, int col, Player player) {
        board.getCell(row, col).setRepresentation(player.getRepresentation());
        board.getCell(row, col).setOwner(player);
    }

    /**public void play() {
        display();
        for (int i = 0; i < board.getLength(); i++) {

        }
    }*/
}