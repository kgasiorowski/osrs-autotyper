import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Typer{

    private Robot robot;

    Collection<String> messages;
    int currentMessage;

    private static final KeyMap keymap = new KeyMap();

    public Typer(Collection<String> messages) {

        try {
            robot = new Robot();
        }catch(AWTException awte){
            System.out.println("Robot not initialized due to error");
        }

        this.messages = messages;
        currentMessage = 0;

    }

    public void start(int iterations){

        final int iters = iterations == 0? Integer.MAX_VALUE : iterations;

        //Starts the autotyper which runs for "seconds" or "iterations" iterations, whichever ends first
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                int counter = 0;
                while(counter <= iters){

                    typeAMessage();
                    counter++;
                    try {
                        Thread.sleep(5000);
                    }catch(InterruptedException ie){
                        System.out.println("Printing thread was interrupted");
                    }
                }

            }
        });

        try {
            Thread.sleep(10000);
        }catch(InterruptedException ie){
            System.out.println("Main thread interrupted");
            System.exit(1);
        }
        thread.start();

    }

    private void typeLetter(char letter){

        Key key;

        if((key = keymap.get(letter)) == null){

            throw new IllegalArgumentException("Error: unsupported key " + letter);

        }

        if(key.shiftPressed)
            robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(key.keycode);
        robot.keyRelease(key.keycode);

        if(key.shiftPressed)
            robot.keyRelease(KeyEvent.VK_SHIFT);

    }

    private void pressEnter(){

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    private void typeAMessage(){

        String message = ((ArrayList<String>)messages).get(currentMessage);

        for (char c : message.toCharArray())
            typeLetter(c);

        pressEnter();

        currentMessage = currentMessage == messages.size()-1 ? currentMessage = 0 : currentMessage+1;

    }

}
