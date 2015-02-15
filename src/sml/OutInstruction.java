package sml;

/**
 * Created by Ahmed on 2/15/2015.
 */
public class OutInstruction extends Instruction {
    private int register;

    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int register) {
        this(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println(m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Printing Register" +  " " + register;
    }
}
