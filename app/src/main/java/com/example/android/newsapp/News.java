package com.example.android.newsapp;

public class News {

    private String mSectionName;
    private String mWebTitle;
    private String mTimeInMilliseconds;
    private String mUrl;
    private String mAuthor;

    News(String mSectionName, String mWebTitle, String mTimeInMilliseconds, String mUrl, String mAuthor) {
        this.mSectionName = mSectionName;
        this.mWebTitle = mWebTitle;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
        this.mAuthor = mAuthor;
    }

    public String getmSectionName() {
        return mSectionName;
    }

    public String getmWebTitle() {
        return mWebTitle;
    }

    public String getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmAuthor() {
        return mAuthor;
    }
}
