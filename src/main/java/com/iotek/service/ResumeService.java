package com.iotek.service;

import com.iotek.model.Resume;

import java.util.List;

/**
 * Created by lenovo on 2018/10/19.
 */
//简历
public interface ResumeService {
    boolean addResume(Resume resume);
    boolean updateResume(Resume resume);
    boolean deleteResume(Resume resume);
    List<Resume> queryAllResume();
    Resume queryResumeById(int r_id);
    Resume queryResumeByName(String r_name);
    List<Resume> queryAllResumeByName(String u_name);
}
