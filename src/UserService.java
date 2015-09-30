import org.apache.ibatis.session.SqlSession;

public class UserService {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Riju");
        person.setUserId(1);
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            personMapper.insertPerson(person);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }
}
