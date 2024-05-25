package FairWork.OOPsDemoForFactory;
import FairWork.OOPsDemoForFactory.Dependencies.*;

public class MongoDB extends Database {

    @Override
    Query getQuery() {
        return new MongoDBQuery();
    }
}
