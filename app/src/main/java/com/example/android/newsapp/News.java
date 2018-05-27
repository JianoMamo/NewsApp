package com.example.android.newsapp;

public class News {

    private String mSectionName;
    private String mWebTitle;
    private String mTimeInMilliseconds;
    private String mUrl;

    public News(String mSectionName, String mWebTitle, String mTimeInMilliseconds, String mUrl) {
        this.mSectionName = mSectionName;
        this.mWebTitle = mWebTitle;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
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
}
