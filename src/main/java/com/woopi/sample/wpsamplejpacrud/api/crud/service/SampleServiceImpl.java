package com.woopi.sample.wpsamplejpacrud.api.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.woopi.sample.wpsamplejpacrud.api.crud.entity.SampleEntity;
import com.woopi.sample.wpsamplejpacrud.api.crud.repository.SampleRepository;

@Service
public class SampleServiceImpl implements SampleService{

    
    //Repository 의존성 추가
    @Autowired
    private SampleRepository sampleRepository;

    /**
     * 데이터 전체 조회
     */
    //interface에 정의한 메소드를 override
    @Override
    public List<SampleEntity> list () {

        List<SampleEntity> list = sampleRepository.findAll();

        return list;
    }

    @Override
    public Page<SampleEntity> list (PageRequest pageRequest) {

        Page<SampleEntity> list = sampleRepository.findAll(pageRequest);

        System.out.println(list);

        return list;
    }
    
}
