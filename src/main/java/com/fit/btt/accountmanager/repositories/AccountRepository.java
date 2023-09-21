package com.fit.btt.accountmanager.repositories;

import com.fit.btt.accountmanager.modals.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;

public class AccountRepository {

  private final EntityManager entityManager;
  private final EntityTransaction transaction;

  public AccountRepository() {
    entityManager = ConnectDB.getInstance().getEntityManager();
    transaction = entityManager.getTransaction();
  }

  public List<Account> getAll() {
    String sql = "select * from account_Info";
    transaction.begin();
    List<Account> list = entityManager.createNativeQuery(sql, Account.class).getResultList();
    transaction.commit();
    return list;
  }

  public Optional<Account> findAccount(String cAccName) {
    Account acc = entityManager.find(Account.class, cAccName);
    if (acc != null) {
      return Optional.of(acc);
    }
    return Optional.empty();
  }

//  public void update(String column,int point, String cAccName){
//    String sql ="UPDATE account_info a SET a."+column+" = :point WHERE cAccName = cAccNae";
//    try {
//      TypedQuery<Account> query = entityManager.createQuery(sql, Account.class);
//      query.setParameter(1, point);
//      query.setParameter(2, cAccName);
//      System.out.println(sql);
//    }catch (Exception e){
//      e.printStackTrace();
//    }
//  }

  public long sumOfnExtPoint1(){
    long sum;
    String sql = "SELECT  SUM(nExtPoint1)  FROM  account_info";
    transaction.begin();
    sum = Long.parseLong(entityManager.createNativeQuery(sql).getSingleResult().toString());
    transaction.commit();
    return sum;
  }


}
