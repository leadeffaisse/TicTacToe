public class Cell {
    private int row;
    private int col;
    private String representation;
    public Player owner;
    public boolean isFree;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.isFree= true;
        this.owner = null;
        this.representation = "   ";
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setOwner(Player player) {
        this.owner = player;
    }

    public boolean isFree() {
        return this.owner == null;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }
}