package com.zrq.service;

import com.zrq.dao.examinee.ExamineeDao;
import com.zrq.entity.MyExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    @Autowired
    private ExamineeDao examineeDao;

    public MyExam findMyexamById(Integer id) {
        return examineeDao.findMyexamById(id);
    }
}
