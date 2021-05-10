package hu.iit.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {

    private Integer id;

    private String userName;

    private String displayName;

    private Integer age;

    private Date createDate;

}
