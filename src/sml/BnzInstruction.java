package sml;

/**
 * Created by Ahmed on 2/15/2015.
 */
public class BnzInstruction extends Instruction {
    private String jumpLabel;
    private int register;

    public BnzInstruction(String label, String op) {
        super(label, op);
    }

    public BnzInstruction(String label, String jumpLabel, int register) {
        this(label,"bnz");
        this.jumpLabel = jumpLabel;
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register) != 0) {
            if(m.getLabels().indexOf(jumpLabel) == 1)
        }
    }
}
