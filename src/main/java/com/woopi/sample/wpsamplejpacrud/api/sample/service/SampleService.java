package com.woopi.sample.wpsamplejpacrud.api.sample.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.woopi.sample.wpsamplejpacrud.api.sample.entity.SampleEntity;

public interface SampleService {
        //Sample Entity의 전체 데이터 조회
        public List<SampleEntity> list();
        //Sample Entity의 전체 데이터 조회 (페이지 적용)
        public Page<SampleEntity> list(PageRequest pageRequest);
}
