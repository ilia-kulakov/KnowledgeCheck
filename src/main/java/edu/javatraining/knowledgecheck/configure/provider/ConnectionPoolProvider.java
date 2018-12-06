package edu.javatraining.knowledgecheck.configure.provider;

import com.google.inject.Provider;
import edu.javatraining.knowledgecheck.data.connection.ConnectionPool;
import edu.javatraining.knowledgecheck.data.connection.ConnectionPoolJdbc;
import edu.javatraining.knowledgecheck.data.dao.UserDao;
import edu.javatraining.knowledgecheck.data.dao.jdbc.UserDaoJdbc;


public class ConnectionPoolProvider implements Provider<ConnectionPool> {
    @Override
    public ConnectionPool get() {
        return new ConnectionPoolJdbc(
                "jdbc:mysql://localhost:3306/quiz?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false",
                "veterkam",
                "15648977");
    }
}
