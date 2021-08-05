package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author fangsheng
 * @date 2021/8/5 12:26 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private List<String> list;
}
