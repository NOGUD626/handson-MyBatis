package handson;

import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
    @Select("SELECT * FROM blogs WHERE id = #{id}")
    Blog selectBlog(int id);
}
