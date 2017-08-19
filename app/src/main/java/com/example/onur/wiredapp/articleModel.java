package com.example.onur.wiredapp;

import android.util.Log;
import android.widget.ImageView;
public class articleModel {

    String articleName ;
    String articleLink ;
    ImageView articleImage;
    String articleContent ;

    articleModel(){
        this.articleContent = "";
        this.articleImage=null;
        this.articleLink = "";
        this.articleName = "";
    }

    public void printArticleModel(){

        Log.d("Article Name = " , this.articleName);
        Log.d("Article Link = " , this.articleLink);
        Log.d("Is Photo Exist ? = ",(this.articleImage != null) ? "YES" : "NO");
        Log.d("Article Content = " , this.articleContent);
    }
}