/**
 * author Maria.Gavrilova
 * copyright 23.07.2018 © Devellar
 */

package exceptionTest;

public class OverrideException extends MainException {

    @Override
    public void start() throws Exception {
        throw new Exception("Not able to open file");
    }
}
