package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        // Find the article at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID sectionName
        TextView sectionNameView = convertView.findViewById(R.id.sectionName);
        sectionNameView.setText(currentNews.getmSectionName());

        TextView webTitleView = convertView.findViewById(R.id.webTitle);
        webTitleView.setText(currentNews.getmWebTitle());

        // Find the TextView with view ID date
        TextView dateView = convertView.findViewById(R.id.webPublicationDate);
        dateView.setText(currentNews.getmTimeInMilliseconds());

        TextView authorView = convertView.findViewById(R.id.authorId);
        authorView.setText(currentNews.getmAuthor());

        return convertView;
    }
}
