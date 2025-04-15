package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskNbaCup implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("""
                    Enter match result string (example: 
                    Los Angeles Clippers 104 Dallas Mavericks 88, New York Knicks 101 Atlanta Hawks 112):
                """);

        String teamNameRegex = "([A-Za-z0-9 ]+)";
        String spase = "\\s";
        String scoreRegex = "(\\d{1,3})";

        String fullRegex = teamNameRegex + spase + scoreRegex + teamNameRegex + spase + scoreRegex;
        String matchResult = reader.readString(fullRegex);
        writer.writePrompt("Enter team name to find (e.g. Boston Celtics): ");
        String teamNameCheckerRegex = "^[A-Za-z\\s]+$";
        String teamName = reader.readString(teamNameCheckerRegex);

        String teamResult = author.getSix().nbaCup(matchResult, teamName);

        writer.writePrompt("Team Result:");
        writer.writeResult(teamResult);
    }
}
