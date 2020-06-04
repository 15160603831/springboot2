package com.cykj.springboot2.entity;


public class TbUser {

  private String userId;
  private String userAcount;
  private String userPwd;
  private String userName;
  private String remarks;
  private String userStarts;
  private String userRegtime;
  private String userScore;
  private TbGrade tbGrade;

  public TbUser() {
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "userId=" + userId +
            ", userAcount='" + userAcount + '\'' +
            ", userPwd='" + userPwd + '\'' +
            ", userName='" + userName + '\'' +
            ", remarks='" + remarks + '\'' +
            ", userStarts='" + userStarts + '\'' +
            ", userRegtime='" + userRegtime + '\'' +
            ", userScore='" + userScore + '\'' +
            ", tbGrade=" + tbGrade +
            '}';
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public TbGrade getTbGrade() {
    return tbGrade;
  }

  public void setTbGrade(TbGrade tbGrade) {
    this.tbGrade = tbGrade;
  }




  public String getUserAcount() {
    return userAcount;
  }

  public void setUserAcount(String userAcount) {
    this.userAcount = userAcount;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public String getUserStarts() {
    return userStarts;
  }

  public void setUserStarts(String userStarts) {
    this.userStarts = userStarts;
  }


  public String getUserRegtime() {
    return userRegtime;
  }

  public void setUserRegtime(String userRegtime) {
    this.userRegtime = userRegtime;
  }


  public String getUserScore() {
    return userScore;
  }

  public void setUserScore(String userScore) {
    this.userScore = userScore;
  }

}
