/**
 * author Maria.Gavrilova
 * copyright 24.07.2018 © Devellar
 */

package patterns.builder;

public class Computer {

    private String display = null;
    private String systemBlock = null;
    private String manipulators = null;

    protected void setDisplay(String display) {
        this.display = display;
    }

    protected void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }

    protected void setManipulators(String manipulators) {
        this.manipulators = manipulators;
    }

    protected String getManipulators() {
        return manipulators;
    }

    protected String getDisplay() {
        return display;
    }

    protected String getSystemBlock() {
        return systemBlock;
    }
}
