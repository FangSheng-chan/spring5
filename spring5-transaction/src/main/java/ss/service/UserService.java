package ss.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ss.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.REQUIRED)
/**
 * @Transactional 可以加在类上和方法上
 *
 * <p>事务方法：对数据库表数据进行变化的操作
 */
public class UserService {

  @Resource private UserDao userDao;

  public void accountMoney() {
    userDao.reduceMoney();
    int i = 1 / 0;
    userDao.addMoney();
  }
}
