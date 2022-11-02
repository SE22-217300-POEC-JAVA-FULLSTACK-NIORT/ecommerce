package com.poe20221004.ecommerce;

import java.util.ArrayList;

public class Basket {
 
    private ArrayList<Article> articles = new ArrayList<>();
   

    public ArrayList<Article> getArticles() {
        return articles;
    }
    
    public void addArticle(Article newArticle){
        articles.add(newArticle);
    }

}
