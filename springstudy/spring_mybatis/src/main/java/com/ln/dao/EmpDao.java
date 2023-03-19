package com.ln.dao;

import com.ln.domin.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDao {




    @Insert("insert into t_emp values(null,#{empName},#{age},#{sex},#{email},#{did})")
    @ResultMap("Emp")
    void save (Emp emp);

    @Select("select * from t_emp where eid=#{eid}")
    @Results(id = "Emp",value = {
            @Result(id = true,property = "eid",column = "eid"),
            @Result(property = "empName",column = "emp_name"),
            @Result(property = "age",column = "age"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "email",column = "email"),
            @Result(property = "did",column = "did")
    })
    Emp getEmpById(@Param("eid") Integer eid);
}
