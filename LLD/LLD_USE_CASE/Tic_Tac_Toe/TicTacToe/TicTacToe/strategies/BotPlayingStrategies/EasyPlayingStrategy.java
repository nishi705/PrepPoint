package FairWork.TicTacToe.strategies.BotPlayingStrategies;

import FairWork.TicTacToe.models.Board;
import FairWork.TicTacToe.models.Cell;
import FairWork.TicTacToe.models.Move;
import FairWork.TicTacToe.models.Player;

public class EasyPlayingStrategy implements BotPlayingStrategy{
    public Move decideMove(Player player, Board board){
        Cell[][] cells = board.getCells();
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells.length; j++){
                if(cells[i][j].getPlayer() == null){
                    Move move = new Move(player, i, j);
                    return move;
                }
            }
        }

        return null;
    }
}
