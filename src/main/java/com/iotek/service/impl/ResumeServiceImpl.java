package com.iotek.service.impl;

import com.iotek.dao.ResumeDao;
import com.iotek.model.Resume;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeDao resumeDao;
    @Override
    public boolean addResume(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.addResume(resume);
    }

    @Override
    public boolean updateResume(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.updateResume(resume);
    }

    @Override
    public boolean deleteResume(Resume resume) {
        if (resume==null){
            return false;
        }
        return resumeDao.deleteResume(resume);
    }

    @Override
    public List<Resume> queryAllResume() {
        List<Resume> resumes=resumeDao.queryAllResume();
        if (resumes==null){
            return null;
        }
        List<Resume> resumes1=new ArrayList<>();
        for (Resume resume:resumes) {
            if("已投".equals(resume.getR_deliver())){
                resumes1.add(resume);
            }
        }
        return resumes1;
    }

    @Override
    public Resume queryResumeById(int r_id) {
        return resumeDao.queryResumeById(r_id);
    }

    @Override
    public List<Resume> queryAllResumeById(int u_id) {
        return resumeDao.queryAllResumeById(u_id);
    }


}
