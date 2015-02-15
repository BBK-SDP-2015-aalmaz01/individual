package sml;

/**
 * This class allows a jump from the current label to a specified label, provided that the contents of the specified register
 * are not equal to 0.
 * Created by Ahmed on 2/15/2015.
 */
public class BnzInstruction extends Instruction {
    private String jumpLabel;
    private int register;

    public BnzInstruction(String label, String op) {
        super(label, op);
    }

    public BnzInstruction(String label, int register, String jumpLabel) {
        this(label,"bnz");
        this.register = register;
        this.jumpLabel = jumpLabel;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register) != 0) {
            int indexOfLabel = m.getLabels().indexOf(jumpLabel);
            if (indexOfLabel != -1) {
                m.setPc(indexOfLabel);
                Instruction nextIns = m.getProg().get(indexOfLabel);
                nextIns.execute(m);
            }

        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "jump to label " + jumpLabel + " if register " + register + " is not 0";
    }
}
