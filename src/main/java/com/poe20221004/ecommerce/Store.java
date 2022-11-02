package com.poe20221004.ecommerce;

import java.util.ArrayList;

public class Store {
 
    private ArrayList<Article> articles = new ArrayList<>();
    
    
    public Store(){
        articles.add(new Article(1, "tablette"));
        articles.add(new Article(2, "tv"));
        articles.add(new Article(3, "smartphone"));
        articles.add(new Article(4, "laptop"));
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }
    
    public Article findArticle(int id){
        for(Article article : articles){
            if(article.getId() == id) {
                return article;
            }
        }
        return null;
    }
}
