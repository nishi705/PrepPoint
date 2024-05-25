package FairWork.TicTacToe.strategies.BotPlayingStrategies;

import FairWork.TicTacToe.models.*;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
