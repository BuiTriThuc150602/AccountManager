package com.fit.btt.accountmanager.controller;

import com.fit.btt.accountmanager.modals.Account;
import com.fit.btt.accountmanager.repositories.AccountRepository;
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.util.List;

@WebServlet(urlPatterns = {"/controller"})
public class ControllServlet extends HttpServlet {
  private AccountRepository accRep;
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {
    accRep = new AccountRepository();
//    String action = request.getParameter("action");
//    if (action.equalsIgnoreCase("getAll")){
//
//    }
    List<Account> listAcc = accRep.getAll();
    long sum = accRep.sumOfnExtPoint1();
    request.setAttribute("listAcc",listAcc);
    request.setAttribute("sumOfnExtPoint1",sum);
    request.getRequestDispatcher("index.jsp").forward(request,response);
  }
}