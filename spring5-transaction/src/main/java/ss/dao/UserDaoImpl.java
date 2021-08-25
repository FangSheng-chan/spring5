package ss.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money +? where username = ?";
        jdbcTemplate.update(sql,100,"marry");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money -? where username = ?";
        jdbcTemplate.update(sql,100,"lucy");
    }
}
