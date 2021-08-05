package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author fangsheng
 * @date 2021/8/4 12:24 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
  private String name;
  private Integer age;
  private List<String> lists;
  private Map<String, String> maps;
  private List<Course> courseList;
}
