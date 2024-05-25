package FairWork.TicTacToe.factories;

import FairWork.TicTacToe.models.BotDifficultyLevel;
import FairWork.TicTacToe.strategies.BotPlayingStrategies.BotPlayingStrategy;
import FairWork.TicTacToe.strategies.BotPlayingStrategies.EasyPlayingStrategy;
import FairWork.TicTacToe.strategies.BotPlayingStrategies.HardPlayingStrategy;
import FairWork.TicTacToe.strategies.BotPlayingStrategies.MediumPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        BotPlayingStrategy bps = null;

        switch (botDifficultyLevel){
            case Easy:
                bps = new EasyPlayingStrategy();
                break;
            case Medium:
                bps = new MediumPlayingStrategy();
                break;
            case Hard:
                bps = new HardPlayingStrategy();
                break;
            default:
                return null;
        }

        return bps;
    }
}
