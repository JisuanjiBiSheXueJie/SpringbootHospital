package com.gaoxin.mapper;

import com.gaoxin.entity.Departments;
import com.gaoxin.entity.Doctor;
import com.gaoxin.entity.Registeredtype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorMapper {
    List<Doctor> doctorList(Doctor doctor);

    int deleteDoctor(Integer doctorId);

    int addDoctor(Doctor doctor);

    int editDoctor(Doctor doctor);

    List<Departments> findAllDepartments();

    List<Registeredtype> findAllRegisteredtype();

    int count(Doctor doctor);

    /*
     * 判断该医生是否还有病人
     * */
    int checkCount(Integer doctorId);
}
