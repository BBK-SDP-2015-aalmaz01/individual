package sml;

/**
 * This class subtracts the contents of two registers, 'op1' and 'op2'. It subtracts op1 from op2 and stores the result in the register 'result'
 * Note that op1, op2 and result are all integers
 * Created by Ahmed on 2/15/2015.
 */
public class SubInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public SubInstruction(String label, String op) {
        super(label, op);
    }

    public SubInstruction(String label, int result, int op1, int op2) {
        this(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString()  + " " + op1 + " - " + op2 + " to " + result;
    }
}
