package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String engWord;


    public String getDefaultTranslation() {
        return engWord;
    }

    public String getMiwokTranslation() {
        return miwokWord;
    }

    public Word(String mi, String eng) {
        miwokWord = mi;
        engWord = eng;
    }


}