package sml;

/**
 * This class multiplies the contents of two registers, 'op1' and 'op2'. The product of this is then stored in the register 'result'.
 * Note that op1, op2 and result are all integers
 * Created by Ahmed on 2/15/2015.
 */
public class MulInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public MulInstruction(String label, String op) {
        super(label, op);
    }

    public MulInstruction(String label, int result, int op1, int op2) {
        this(label, "mul");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 * value2);
    }

    @Override
    public String toString() {
        return super.toString()  + " " + op1 + " * " + op2 + " to " + result;
    }
}
