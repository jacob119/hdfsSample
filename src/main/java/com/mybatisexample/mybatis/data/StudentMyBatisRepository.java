package com.mybatisexample.mybatis.data;


import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface StudentMyBatisRepository {
    @Select("select * from student")
    public List<Student> findAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    public Student findById(long id);

    @Delete("DELETE FROM student WHERE id = #{id}")
    public int deleteById(long id);

    @Delete("DELETE FROM student ")
    public int deleteAll();

    @Insert("INSERT INTO student(id, name, passport) VALUES (#{id}, #{name}, #{passport})")
    public int insert(Student student);

    @Update("Update student set name=#{name}, passport=#{passport} where id=#{id}")
    public int update(Student student);

}