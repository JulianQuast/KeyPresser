/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keypresser;

import java.awt.AWTException;
import static java.lang.Math.random;

/**
 *
 * @author Julian
 */
public class KeyPresser {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
//        randomString();
        Thread.sleep(20000L);
        while (true) {
            loop();
        }
    }

    public static void loop() throws InterruptedException, AWTException {
        String text = "danke  " + randomString() + randomString() + randomString();
        Keyboard k = new Keyboard();
        k.type(text);
        k.enter();
        Thread.sleep(200L);
    }

    public static String randomString() {
        return String.valueOf((char) (random() * 10 + 97));
    }
}