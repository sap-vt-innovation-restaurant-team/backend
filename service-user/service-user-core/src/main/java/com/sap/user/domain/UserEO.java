package com.sap.user.domain;

import com.sap.common.domain.BaseEO;
import org.springframework.data.annotation.Id;

public class UserEO {
  @Id
  private String id;

  private String nickname;

  private String email;

  public UserEO() {}

  public UserEO(String id, String nickname, String email) {
    this.id = id;
    this.nickname = nickname;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "UserEO{" +
            "id='" + id + '\'' +
            "nickname='" + nickname + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
