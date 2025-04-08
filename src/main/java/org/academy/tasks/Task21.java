package org.academy.tasks;

import org.academy.interfaces.ITask;
import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;


public class Task21 implements ITask {    
    String name = "Which x for that sum?\r\n";
    int Id = 21;
    String description = "Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.\r\n" + //
    "\r\n" + //
    "When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x) goes to a finite limit m depending on x.\r\n" + //
    "\r\n" + //    
    "Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).\r\n" + //
    "\r\n" + //
    "Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.\r\n" + //
    "\r\n" + //    
    "Examples:\r\n" + //
    "solve(2.0) returns 0.5 since U(n, 0.5) goes to 2 when n goes to infinity.\r\n" + //
    "\r\n" + //
    "solve(8.0) returns 0.7034648345913732 since U(n, 0.7034648345913732) goes to 8 when n goes to infinity.\r\n" + //
    "\r\n" + //    
    "Note:\r\n" + //
    "\r\n" + //
    "You pass the tests if abs(actual - expected) <= 1e-12;";

    @Override
    public void run(Authors author, IReader reader, IWriter writer){

        writer.writePrompt("Enter an double value.");

        double m = reader.readDouble((double) 0);

        double result = author.getFive().solve(m);

        writer.writeResult(result);
    }
}