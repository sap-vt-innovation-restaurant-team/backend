package com.sap.common.domain;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class BaseEO {
  @Id
  @NotNull
  private String id;

  public BaseEO() {}

  public BaseEO(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
