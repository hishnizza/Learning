/**
 * author Maria.Gavrilova
 * copyright 23.07.2018 © Devellar
 */

package exceptionTest;

import java.sql.SQLDataException;

public class MainException {

    public void start() throws SQLDataException, Exception {
        throw new SQLDataException("Not able to open file");
    }

}
