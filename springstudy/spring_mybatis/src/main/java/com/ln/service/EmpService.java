package com.ln.service;

import com.ln.dao.EmpDao;
import com.ln.domin.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpDao empDao;

    public void save(Emp emp){
        empDao.save(emp);
    }

    public Emp getEmpById(Integer id){
        Emp emp = empDao.getEmpById(id);
        return emp;
    }
}
