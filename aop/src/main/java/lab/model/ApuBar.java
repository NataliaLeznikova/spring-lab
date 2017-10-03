package lab.model;

import lab.aop.AopLog;
import org.aspectj.lang.annotation.Around;

public class ApuBar implements Bar {

    @Around("execution(* sellSquishee(..))")
	public Squishee sellSquishee(Customer customer)  {
        if (customer.isBroke()){
            throw new CustomerBrokenException();
        }
        AopLog.append("Here is your Squishee \n");
        return new Squishee("Usual Squishee");
    }
}