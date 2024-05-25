package FairWork.TicTacToe.strategies.GameWinningStrategy;

import FairWork.TicTacToe.models.Board;
import FairWork.TicTacToe.models.Cell;
import FairWork.TicTacToe.models.GameState;
import FairWork.TicTacToe.models.Player;

public interface GameWinningStrategy {
    GameState checkForWinner(Board board, Player player, Cell cell);
}
