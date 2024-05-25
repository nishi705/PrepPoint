package FairWork.SingletonDesignPattern;

import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private String url;
    private String userName;
    private String pwd;
    private static ReentrantLock lock = new ReentrantLock();
    private DBConnection(String url, String userName, String pwd){
        this.url = url;
        this.userName = userName;
        this.pwd = pwd;
    }

    private static DBConnection inst = null;
    public static DBConnection getInstance(String url, String userName, String pwd){
        if(inst == null){
            synchronized (DBConnection.class){
                if(inst == null){
                    inst = new DBConnection(url, userName, pwd);
                }
            }
        }
        return inst;
    }
}
