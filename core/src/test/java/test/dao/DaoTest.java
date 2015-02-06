package test.dao;

import com.sao.euphonious.core.dao.IStudentDao;
import com.sao.euphonious.core.dao.StudentDao;
import com.sao.euphonious.core.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by navia on 2015/2/5.
 */
@ContextConfiguration(locations = {"classpath:hibernate-context.xml"})
public class DaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    //@Resource(name="studentDao")
    @Autowired
    private IStudentDao studentDao; // 这里一定要用接口指向

    @Test
    public void Test(){
        List<Student> students = studentDao.findByAll();
        for(Student s : students){
            System.out.println(s.getName());
        }
    }
}
