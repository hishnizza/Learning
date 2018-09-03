/**
 * author Maria.Gavrilova
 * copyright 23.07.2018 © Devellar
 */

package exceptionTest;

class GetOutOfMyLifeException extends Exception {

    GetOutOfMyLifeException() {
        System.out.println("Oooops.... GetOutOfMyLifeException took place. Bye-bye!");
    }
}
