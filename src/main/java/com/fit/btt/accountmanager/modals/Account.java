package com.fit.btt.accountmanager.modals;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "account_Info")

public class Account {
  @Id
  @Column(name = "cAccName")
  private String cAccName;
  @Column(name = "cSecPassWord")
  private String cSecPassWord;
  @Column(name = "cPassWord")
  private String cPassWord;
  @Column(name = "iClientID")
  private int iClientID;
  @Column(name = "dLoginDate")
  private Date dLoginDate;
  @Column(name = "dLogoutDate")
  private Date dLogoutDate;
  @Column(name = "nExtPoint")
  private int nExtPoint;
  @Column(name = "nExtPoint1")
  private int nExtPoint1;
  @Column(name = "nExtPoint2")
  private int nExtPoint2;
  @Column(name = "nExtPoint3")
  private int nExtPoint3;
  @Column(name = "nExtPoint4")
  private int nExtPoint4;
  @Column(name = "nExtPoint5")
  private int nExtPoint5;
  @Column(name = "nExtPoint6")
  private int nExtPoint6;
  @Column(name = "nExtPoint7")
  private int nExtPoint7;
  @Column(name = "nUserIP")
  private long nUserIP;
  @Column(name = "nUserIPPort")
  private long nUserIPPort;
  @Column(name = "nFreeType")
  private int nFreeType;

  public Account() {
  }

  public Account(String cAccName, String cSecPassWord, String cPassWord, int iClientID,
      Date dLoginDate, Date dLogoutDate, int nExtPoint, int nExtPoint1, int nExtPoint2,
      int nExtPoint3, int nExtPoint4, int nExtPoint5, int nExtPoint6, int nExtPoint7, long nUserIP,
      long nUserIPPort, int nFreeType) {
    setcAccName(cAccName);
    setcSecPassWord(cSecPassWord);
    setcPassWord(cPassWord);
    setiClientID(iClientID);
    setdLoginDate(dLoginDate);
    setdLogoutDate(dLogoutDate);
    setnExtPoint(nExtPoint);
    setnExtPoint1(nExtPoint1);
    setnExtPoint2(nExtPoint2);
    setnExtPoint3(nExtPoint3);
    setnExtPoint4(nExtPoint4);
    setnExtPoint5(nExtPoint5);
    setnExtPoint6(nExtPoint6);
    setnExtPoint7(nExtPoint7);
    setnUserIP(nUserIP);
    setnUserIPPort(nUserIPPort);
    setnFreeType(nFreeType);
  }

  public String getcAccName() {
    return cAccName;
  }

  public void setcAccName(String cAccName) {
    this.cAccName = cAccName;
  }

  public String getcSecPassWord() {
    return cSecPassWord;
  }

  public void setcSecPassWord(String cSecPassWord) {
    this.cSecPassWord = cSecPassWord;
  }

  public String getcPassWord() {
    return cPassWord;
  }

  public void setcPassWord(String cPassWord) {
    this.cPassWord = cPassWord;
  }

  public int getiClientID() {
    return iClientID;
  }

  public void setiClientID(int iClientID) {
    this.iClientID = iClientID;
  }

  public Date getdLoginDate() {
    return dLoginDate;
  }

  public void setdLoginDate(Date dLoginDate) {
    this.dLoginDate = dLoginDate;
  }

  public Date getdLogoutDate() {
    return dLogoutDate;
  }

  public void setdLogoutDate(Date dLogoutDate) {
    this.dLogoutDate = dLogoutDate;
  }

  public int getnExtPoint() {
    return nExtPoint;
  }

  public void setnExtPoint(int nExtPoint) {
    this.nExtPoint = nExtPoint;
  }

  public int getnExtPoint1() {
    return nExtPoint1;
  }

  public void setnExtPoint1(int nExtPoint1) {
    this.nExtPoint1 = nExtPoint1;
  }

  public int getnExtPoint2() {
    return nExtPoint2;
  }

  public void setnExtPoint2(int nExtPoint2) {
    this.nExtPoint2 = nExtPoint2;
  }

  public int getnExtPoint3() {
    return nExtPoint3;
  }

  public void setnExtPoint3(int nExtPoint3) {
    this.nExtPoint3 = nExtPoint3;
  }

  public int getnExtPoint4() {
    return nExtPoint4;
  }

  public void setnExtPoint4(int nExtPoint4) {
    this.nExtPoint4 = nExtPoint4;
  }

  public int getnExtPoint5() {
    return nExtPoint5;
  }

  public void setnExtPoint5(int nExtPoint5) {
    this.nExtPoint5 = nExtPoint5;
  }

  public int getnExtPoint6() {
    return nExtPoint6;
  }

  public void setnExtPoint6(int nExtPoint6) {
    this.nExtPoint6 = nExtPoint6;
  }

  public int getnExtPoint7() {
    return nExtPoint7;
  }

  public void setnExtPoint7(int nExtPoint7) {
    this.nExtPoint7 = nExtPoint7;
  }

  public long getnUserIP() {
    return nUserIP;
  }

  public void setnUserIP(long nUserIP) {
    this.nUserIP = nUserIP;
  }

  public long getnUserIPPort() {
    return nUserIPPort;
  }

  public void setnUserIPPort(long nUserIPPort) {
    this.nUserIPPort = nUserIPPort;
  }

  public int getnFreeType() {
    return nFreeType;
  }

  public void setnFreeType(int nFreeType) {
    this.nFreeType = nFreeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Account)) {
      return false;
    }
    Account account = (Account) o;
    return getnUserIP() == account.getnUserIP();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getnUserIP());
  }

  @Override
  public String toString() {
    return "Account{" +
        "cAccName='" + cAccName + '\'' +
        ", cSecPassWord='" + cSecPassWord + '\'' +
        ", cPassWord='" + cPassWord + '\'' +
        ", iClientID=" + iClientID +
        ", dLoginDate=" + dLoginDate +
        ", dLogoutDate=" + dLogoutDate +
        ", nExtPoint=" + nExtPoint +
        ", nExtPoint1=" + nExtPoint1 +
        ", nExtPoint2=" + nExtPoint2 +
        ", nExtPoint3=" + nExtPoint3 +
        ", nExtPoint4=" + nExtPoint4 +
        ", nExtPoint5=" + nExtPoint5 +
        ", nExtPoint6=" + nExtPoint6 +
        ", nExtPoint7=" + nExtPoint7 +
        ", nUserIP=" + nUserIP +
        ", nUserIPPort=" + nUserIPPort +
        ", nFreeType=" + nFreeType +
        '}';
  }
}
