package exam;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by Administrator on 2014-11-25.
 */
public interface Model1Mapper {
    @Select({
            "select name,description from model1"
    })
    @Results({
            @Result(column="name", property="name", jdbcType = JdbcType.VARCHAR, id=true),
            @Result(column="description", property="description", jdbcType = JdbcType.VARCHAR)
    })
    List<Model1> list();
}
