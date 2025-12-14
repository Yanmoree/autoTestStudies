package kz.kedo.tests;

import kz.kedo.steps.ConcatAndCheckPhraseActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatAndCheckPhraseTest {

    private static String firstPartPhrase = "Мне нравится программировать";
    private static String lastPartPhrase = "на языке Java!";
    static String fullPhrase = "Мне нравится программировать на языке Java!";
    private ConcatAndCheckPhraseActions phraseActions = new ConcatAndCheckPhraseActions();


    @Test
    public void checkPhraseTest() {

        String generatePhrase = phraseActions.concutPhrase(firstPartPhrase, lastPartPhrase);

        boolean isValid = phraseActions.checkValidPhrase(generatePhrase, fullPhrase);

        Assert.assertTrue(isValid, "Сгенерированная фраза не соответсвует заданной");

    }

}
