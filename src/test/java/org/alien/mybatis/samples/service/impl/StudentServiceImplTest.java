package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.model.Student;
import org.alien.mybatis.samples.service.StudentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lihoo
 * @Title: StudentServiceImplTest
 * @ProjectName myBatisDemo_4
 * @Description: TODO
 * @date 2018/7/1214:46
 */


public class StudentServiceImplTest {
    private StudentService studentService;

    @Before
    public void setUp() throws Exception {
        studentService = new StudentServiceImpl();
    }

    @Test
    public void testAddStudent() throws Exception {
        Assert.assertEquals(true,studentService.addStudent
                (new Student(50,"皮皮怪",999999999,
                        "web工程师",20190707,"双鸭山大学",
                        "8856","https://www.odd4loah.cn","你把闪现给我交了",
                        "清哥","人们",1577811661,
                        1893430861)) > 0);
    }

    @Test
    public void testDeleteStudent() throws Exception {
        Assert.assertEquals(true,studentService.deleteStudent(18) > 0);
    }
//
    @Test
    public void testUpdateStudent() throws Exception {
        Assert.assertEquals(true,studentService.updateStudent
                (new Student(20,"王实甫",1999999999,
                "1web工程师",120190707,"1双鸭山大学",
                "18856","1https://www.odd4loah.cn","1你把闪现给我交了",
                "1清哥","1人们",1577811661,
                1893430861)) > 0);
    }

    @Test
    public void testGetStudentById() throws Exception {
        studentService.getStudentById(10).getUsername();
    }
//
//    private static Logger logger = Logger.getLogger(Testspringmybanits.class);
//    PropertyConfigurator.configure("E:/java/springtest/src/main/resources/log4j.properties");

    //end_Test
}
