package kz.kedo.steps;

import org.testng.annotations.Test;

public class ConcatAndCheckPhraseActions {

    public String concutPhrase(String fistPartPhrase, String lastPartPhrase) {

        return fistPartPhrase + " " + lastPartPhrase;

    }

    public boolean checkValidPhrase(String generatePhrase, String fullPhrase) {

        return fullPhrase.equals(generatePhrase);

    }

}
