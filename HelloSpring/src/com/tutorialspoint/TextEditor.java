package com.tutorialspoint;

public class TextEditor
{
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker2)
    {
        // TODO Auto-generated constructor stub
    }

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker)
    {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker()
    {
        return spellChecker;
    }

    public void spellCheck()
    {
        spellChecker.checkSpelling();
    }

}
