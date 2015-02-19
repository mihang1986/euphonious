package test;

import com.sao.euphonious.core.dao.IStudentDao;
import com.sao.euphonious.core.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by navia on 2015/2/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate-context.xml", "classpath:service-context.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class ServiceTest {

    @Resource(name = "studentDao")
    //@Autowired
    private IStudentDao studentDao;

    @Test
    public void test1(){
        Student s = new Student();
        s.setName("ca");
        s.setAge(99);
        studentDao.create(s);
    }
}
