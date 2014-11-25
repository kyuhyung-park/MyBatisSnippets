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

        // 어노테이션을 이용한 매퍼를 사용하여 쿼리 수행
//        List<Model1> list = sqlSession.getMapper(Model1Mapper.class).list();
//        System.out.println("MyBatisExam1 list results:");
//        for(Model1 model1:list){
//            System.out.println(model1);
//        }

        System.out.println("");

        // xml 파일을 이용한 매퍼를 사용하여 쿼리 수행
        List<Model2> model2List = sqlSession.selectList("exam.Model2Mapper.listModel2");
        System.out.println("model2 list:");
        for(Model2 model2:model2List){
            System.out.println(model2);
        }


    }
}
