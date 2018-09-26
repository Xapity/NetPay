/*
Finds the net pay for an employees work,
 */

package netpay;

/**
 *
 * @author camac2045
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float n, h, w, i, t;//declaring variables
        h = (float) 40.0;
        w = (float) 5.0;
        i = (float) 2.0;
        t = (float) 0.22;
        n = (h*w-i)-t*(h*w-i);
            System.out.println("The net pay for the employee is " + n +"$.");
    }
    
}
