package handson;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class App {
    public static void main(String[] args) {
        
        SqlSession session = null;
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            session = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(session != null) {
            try {
                BlogMapper mapper = session.getMapper(BlogMapper.class);
                System.out.println(mapper.selectBlog(2));
            } finally {
                session.close();
            }
        }
    }
}
