package com.cykj.springboot2.entity;


import java.util.List;

public class TbGrade {

    private long gradeId;
    private String gradeName;
    private List<String> list;

    @Override
    public String toString() {
        return "TbGrade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public long getGradeId() {
        return gradeId;
    }

    public void setGradeId(long gradeId) {
        this.gradeId = gradeId;
    }


    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

}
