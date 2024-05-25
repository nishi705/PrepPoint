package FairWork.OOPsDemoForFactory;
import FairWork.OOPsDemoForFactory.Dependencies.*;

public class MySQLDB extends Database {
    Query getQuery() {
        return new MySQLQuery();
    }
}
