package com.fit.btt.accountmanager.controller;
import com.fit.btt.accountmanager.repositories.AccountRepository;

public class TestConnect {

  public static void main(String[] args) {
    AccountRepository accRep = new AccountRepository();
    System.out.println("sum : " + accRep.sumOfnExtPoint1());


  }

}
