package No2;

import java.util.Arrays;

import No1.TaskTimeHelper;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("||  Text to Type  ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot 1", TaskTimeHelper.getRandomNumber(), typeRacer);
        typers[1] = new Typer("Bot 2", TaskTimeHelper.getRandomNumber(), typeRacer);
        typers[2] = new Typer("Bot 3", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[3] = new Typer("Bot 4", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[4] = new Typer("Bot 5", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[5] = new Typer("Bot 6", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[6] = new Typer("Bot 7", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[7] = new Typer("Bot 8", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[8] = new Typer("Bot 9", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[9] = new Typer("Bot 10", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[10] = new Typer("Bot 11", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[11] = new Typer("Bot 12", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[12] = new Typer("Bot 13", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[13] = new Typer("Bot 14", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[14] = new Typer("Bot 15", TaskTimeHelper.getRandomNumber(), typeRacer);
        // typers[15] = new Typer("Bot 16", TaskTimeHelper.getRandomNumber(), typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
