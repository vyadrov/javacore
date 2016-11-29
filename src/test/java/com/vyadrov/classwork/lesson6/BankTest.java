package com.vyadrov.classwork.lesson6;

import com.vyadrov.app.utils.classwork.lesson5.Bank;
import com.vyadrov.app.utils.classwork.lesson5.Person;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class BankTest {
    static Bank privatbank;
    @BeforeClass
    public static void  precondition() {
        privatbank = new Bank("Privatbank");
        System.out.println("Test CLASS was started");
    }
    @Before
    public void messageStart() {
        System.out.println("\nTest started");
    }
    @After
    public void messageEnd() {
        System.out.println("Test finished");
    }
    @Test
    public void verifyStudent() throws Exception {
        Person student = new Person();
        student.setAge(21);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);

        Bank privatbank = new Bank("Privatbank");

        Assert.assertTrue(privatbank.isLoanCanBeIssued(student));

    }
    //@Ignore ("Test disabled due to...")
    @Test (timeout = 3000)
    public void verifyPensioner() {
        Person pensioner = new Person();
        pensioner.setAge(45);
        pensioner.setFeedbackFlag(true);
        pensioner.setSalary(1200);
        pensioner.setWorkingTime(25);
        Bank privatbank = new Bank("Privatbank");

        Assert.assertTrue(privatbank.isLoanCanBeIssued(pensioner));
    }

}