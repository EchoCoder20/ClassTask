import java.util.Arrays;

class Cell {
    public enum CellType {
        OPEN, WALL, START, FINISH
    }

    private CellType type;
    private boolean visited = false;

    public Cell(CellType type) {
        this.type = type;
    }

    public CellType getType() {
        return type;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

public class MazeSolver {
    private Cell[][] maze;

    public MazeSolver(Cell[][] maze) {
        this.maze = maze;
    }

    /**
     * Finds a path from the start to the finish of the maze.
     \*
     * @param row The current row.
     * @param col The current column.
     * @return true if a path is found, false otherwise.
     */
    public boolean findPath(int row, int col) {


//        checkPath(maze,row, col)
        if (row<0 && col<0 || row >= maze.length && col>= maze.length)
            return false;
        if (!maze[row][col].isVisited()) {


            if (col+1 < maze.length && maze[row][col + 1].getType() == Cell.CellType.FINISH ) {
                return true;
            }
            else if (row+1 < maze.length && maze[row+1][col].getType() == Cell.CellType.FINISH )
            {
                return true;
            }

                if (maze[row][col + 1].getType() == Cell.CellType.OPEN) {
                maze[row][col].setVisited(true);
                return findPath(row, col + 1);
            } else if (maze[row + 1][col].getType() == Cell.CellType.OPEN) {
                maze[row][col].setVisited(true);
                return findPath(row + 1, col);

            }
            else if (maze[row -1][col].getType() == Cell.CellType.OPEN) {
                maze[row][col].setVisited(true);
                return findPath(row - 1, col);

            }
            else if (maze[row][col-1].getType() == Cell.CellType.OPEN) {
                maze[row][col].setVisited(true);
                return findPath(row, col-1);

            }
            else return false;

        }
        return false;


    }

    public static void main(String[] args) {
        Cell[][] mazeLayout = {
                {new Cell(Cell.CellType.START), new Cell(Cell.CellType.OPEN), new Cell(Cell.CellType.WALL)},
                {new Cell(Cell.CellType.WALL), new Cell(Cell.CellType.OPEN), new Cell(Cell.CellType.OPEN)},
                {new Cell(Cell.CellType.OPEN), new Cell(Cell.CellType.OPEN), new Cell(Cell.CellType.FINISH)}
        };
        int startRow = 0;
        int startCol = 0;

        MazeSolver solver = new MazeSolver(mazeLayout);
        if (solver.findPath(startRow, startCol)) {
            System.out.println("Path found!");
        } else {
            System.out.println("No path exists.");
        }
    }
}