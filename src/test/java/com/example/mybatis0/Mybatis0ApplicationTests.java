package com.example.mybatis0;

import com.example.mybatis0.entity.EmployeesExample;
import com.example.mybatis0.mapper.EmployeesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatis0ApplicationTests {

    @Autowired
    private EmployeesMapper employeesMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test0(){
        EmployeesExample employeesExample = new EmployeesExample();
        EmployeesExample.Criteria criteria = employeesExample.createCriteria();
        criteria.andFirstNameLike("%L%");
        long l = employeesMapper.countByExample(employeesExample);

        System.out.println(l);

    }

}
