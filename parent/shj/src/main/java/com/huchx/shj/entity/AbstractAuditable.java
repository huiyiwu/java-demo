package com.huchx.shj.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

/**
 * @Author: yd
 * @Date: 2019/5/27 10:50
 * @Version 1.0
 */
public abstract class AbstractAuditable<U, PK extends Serializable> extends AbstractPersistable<PK> {

    @ManyToOne
    @CreatedBy
    private U createdBy;
    @Column(name = "create_time")
    @CreatedDate
    private LocalDateTime createdDate;
    @ManyToOne
    @LastModifiedBy
    private U lastModifiedBy;
    @LastModifiedDate
    @Column(name = "last_modified_time")
    private LocalDateTime lastModifiedDate;

}
