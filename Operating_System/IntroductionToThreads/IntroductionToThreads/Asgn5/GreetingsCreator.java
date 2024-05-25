package FairWork.IntroductionToThreads.Asgn5;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String> {
    Random r;
    public GreetingsCreator(Random r){
        this.r = r;
    }

    @Override
    public String call() throws Exception {
        if(r.nextBoolean()){
            return "Hello generated by " + Thread.currentThread().getName();
        } else {
            return "Bye generated by " + Thread.currentThread().getName();
        }
    }
}
