package com.huchx.shj.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "m_user")
@Getter
@Setter
public class UserEntity extends AbstractPersistable<Long> {

    private String identityNo;

    private String loginName;
}
