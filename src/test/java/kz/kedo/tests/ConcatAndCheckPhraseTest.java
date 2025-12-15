package kz.kedo.tests;

import kz.kedo.steps.ConcatAndCheckPhraseActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatAndCheckPhraseTest {

    private static final String FIRTS_PART_PHRASE  = "Мне нравится программировать";
    private static final String LAST_PART_PHRASE = "на языке Java!";
    private static final String FULL_PHRASE = "Мне нравится программировать на языке Java!";
    private ConcatAndCheckPhraseActions phraseActions = new ConcatAndCheckPhraseActions();


    @Test
    public void checkPhraseTest() {

        String generatePhrase = phraseActions.concutPhrase(FIRTS_PART_PHRASE, LAST_PART_PHRASE);

        boolean isValid = phraseActions.checkValidPhrase(generatePhrase, FULL_PHRASE);

        Assert.assertTrue(isValid, "Сгенерированная фраза не соответсвует заданной");

    }

}
