package exam;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2014-11-24.
 */
public class MyBatisExam1 {

    public static void main(String... args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Model1> list = sqlSession.getMapper(Model1Mapper.class).list();


        System.out.println("MyBatisExam1 list results:");
        for(Model1 model1:list){
            System.out.println(model1);
        }

    }
}
