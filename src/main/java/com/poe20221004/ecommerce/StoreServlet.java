package com.poe20221004.ecommerce;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/store")
public class StoreServlet extends HttpServlet {
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {     
        Store store = (Store)request.getSession().getAttribute("store");
        if(store == null){
            store= new Store();
            request.getSession().setAttribute("store", store);
        }
        
        System.out.println(store.getArticles().size());
        
       request.setAttribute( "articles", store.getArticles());
       request.getRequestDispatcher("WEB-INF/store.jsp").forward(request, response);
    }
}
