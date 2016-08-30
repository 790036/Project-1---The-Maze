
/**
 * Write a description of class MyFirstProgram here.
 * 
 * @Levi Rutherford
 * @FirstClass
 */
public class MyFirstProgram
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
    }
}
