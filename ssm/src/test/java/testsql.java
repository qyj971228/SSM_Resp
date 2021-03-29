import com.qyj.domain.Account;
import com.qyj.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testsql {
    @Test
    public void test1() throws IOException {
        Account account = new Account();
        account.setId(1);
        account.setMoney(123.0);
        account.setName("name");
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        mapper.save(account);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> all = mapper.findAll();
        for(Account account: all){
            System.out.println(account);
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
