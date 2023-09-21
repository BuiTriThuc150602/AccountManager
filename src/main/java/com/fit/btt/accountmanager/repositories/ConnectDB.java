package com.fit.btt.accountmanager.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectDB {

  private static ConnectDB instance;
  private final EntityManager entityManager;

  private ConnectDB() {
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("account_manager");
    entityManager = managerFactory.createEntityManager();

  }

  public static ConnectDB getInstance() {
    if (instance == null) {
      instance = new ConnectDB();
    }
    return instance;
  }

  public EntityManager getEntityManager() {
    return entityManager;
  }
}
