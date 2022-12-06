class Main {

    public static void main(String[] args) {
        Board emptySudoQBoard = new EmptySudoQBoard(9);

        Board sudoQBoard = new SudoQBoard(9);
        sudoQBoard.show();

        Solver.solveSudoku(sudoQBoard);
        Solver.solveSudoku(emptySudoQBoard);
    }


}
