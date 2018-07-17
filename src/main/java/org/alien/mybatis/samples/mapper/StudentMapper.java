package org.alien.mybatis.samples.mapper;

import org.alien.mybatis.samples.model.Student;

/**
 * @author lihoo
 * @Title: StudentMapper
 * @ProjectName myBatisDemo_4
 * @Description: TODO
 * @date 2018/7/1214:39
 */


public interface StudentMapper {
    int addStudent(Student student);

    int deleteStudent(int id);

    int updateStudent(Student student);

    Student getStudentById(int id);


}
