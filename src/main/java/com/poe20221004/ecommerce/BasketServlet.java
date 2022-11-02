package com.poe20221004.ecommerce;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket")
public class BasketServlet extends HttpServlet {
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {     
        Basket basket = (Basket)request.getSession().getAttribute("basket");
        if(basket == null){
            basket = new Basket();
        }
       request.setAttribute( "articles", basket.getArticles());     
       request.getRequestDispatcher("WEB-INF/basket.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    { 
        Store store = (Store)request.getSession().getAttribute("store");
        if(store == null){
            store= new Store();
            request.getSession().setAttribute("store", store);
        }
        
        String articleId = request.getParameter("articleId");
        int id = Integer.parseInt(articleId);
        
        Article newArticle = store.findArticle(id);
        
        Basket basket = (Basket)request.getSession().getAttribute("basket");
        if(basket == null){
            basket = new Basket();
        }
        
        basket.addArticle(newArticle);
        request.getSession().setAttribute("basket", basket);
        
        doGet(request, response);
    }
}
