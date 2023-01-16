package com.woopi.sample.wpsamplejpacrud.api.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sample")
public class SampleEntity {

    @Id        //기본 키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //값 자동 생성 (IDENTIFY : 기본 키 생성을 데이터베이스에 위임)
    private Long id;

    @Column(length = 255, nullable = false)     //column 지정, 길이 : 255, null을 허용하지 않음
    private String name;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}
