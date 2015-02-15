package tests;

import org.junit.Before;
import org.junit.Test;
import sml.Machine;
import sml.Translator;

import java.io.File;

import static org.junit.Assert.*;

public class InstructionTest {
    private Machine m = new Machine();
    private String fileName = ("tests" + File.separator + "InstrText.txt");

    @Before
    public void BuildUp(){
        Translator t = new Translator(fileName);
        t.readAndTranslate(m.getLabels(), m.getProg());

        System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        System.out.println(m);

        System.out.println("Beginning program execution.");
        m.execute();
        System.out.println("Ending program execution.");

        System.out.println("Values of registers at program termination:");
        System.out.println(m.getRegisters() + ".");
    }


    @Test
    public void TestLin() {
        int expected = 5;
        int actual = m.getRegisters().getRegister(1);
        assertEquals(expected, actual);

        expected = 6;
        actual = m.getRegisters().getRegister(2);
        assertEquals(expected, actual);
    }
}