package com.woopi.sample.wpsamplejpacrud.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woopi.sample.wpsamplejpacrud.api.crud.entity.SampleEntity;
import com.woopi.sample.wpsamplejpacrud.api.crud.service.SampleService;

@Controller //Controller 임을 명시
@RequestMapping(value = "/api/sample/crud")  //url prefix 명시
public class SampleController {

        //service를 의존성 추가
        @Autowired
        private SampleService sampleService;
    
    
        /**
         * 전체 데이터 조회
         * @return 전체 데이터
         */
        @GetMapping(value = "/list")
        public ResponseEntity<?> list() {
    
            List<SampleEntity> list = sampleService.list();
    
            return ResponseEntity.ok().body(list);
        }

        /**
         * 전체 데이터 조회
         * @return 전체 데이터
         */
        @GetMapping(value = "/list/{page}")
        public ResponseEntity<?> list(@PathVariable("page") int page) {
    
            PageRequest pageRequest = PageRequest.of(page, 5);

            Page<SampleEntity> list = sampleService.list(pageRequest);
    
            return ResponseEntity.ok().body(list);
        }
    
}
