package FairWork.OOPsDemoForFactory;

public class Client {
    public static void main(String[] args) {
        // OCP Violation in this part
        // This will be resolved eventually by using DI containers
        // at application start, they read a config file and provide dependencies
        Database db = null;
        if(type == "MySQL"){
            db = new MySQLDB();
        } else if(type == "MongoDB"){
            db = new MongoDB();
        }
        // OCP violation


        db.work();
    }
}
