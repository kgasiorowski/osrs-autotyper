import java.util.ArrayList;

public class Client {

    public static void main(String[] args){

        ArrayList<String> messages = new ArrayList<>();

        messages.add("New to the game? Need help making money?");
        messages.add("Join cc: \"ffdn36\", the oldest and best nature rune running clan!");
        messages.add("Start running today, and get a free glory amulet!");

        Typer typer = new Typer(messages);

        typer.start(7);

    }

}