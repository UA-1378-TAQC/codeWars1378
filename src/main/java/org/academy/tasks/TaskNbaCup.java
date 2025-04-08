package org.academy.tasks;

import org.academy.util.Authors;
import org.academy.util.data.IReader;
import org.academy.util.data.IWriter;

public class TaskNbaCup implements ITask {
    @Override
    public void run(Authors author, IReader reader, IWriter writer) {
        writer.writePrompt("Enter match result string: ");

        String teamNameRegex = "([A-Za-z0-9 ]+)"; // Captures the name of the first team. Matches letters, digits, and spaces.
        String spase = "\\s"; // Matches a space between the team name and the score.
        String scoreRegex = "(\\d{1,3})"; // Captures the score of the first team (1 to 3 digits). Matches numbers like 104, 88, etc.

        String fullRegex = teamNameRegex + spase + scoreRegex + teamNameRegex + spase + scoreRegex;
        String matchResult = reader.readString(fullRegex);
        writer.writePrompt("Enter team name to find: ");
        String teamNameCheckerRegex = "^[A-Za-z\\s]+$";
        String teamName = reader.readString(teamNameCheckerRegex);

        String teamResult = author.getSix().nbaCup(matchResult, teamName);

        writer.writePrompt("Team Result:");
        writer.writeResult(teamResult);
    }
}
