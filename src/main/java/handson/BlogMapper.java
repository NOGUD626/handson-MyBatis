package handson;

import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.scripting.freemarker.FreeMarkerLanguageDriver;

public interface BlogMapper {
    @Lang(FreeMarkerLanguageDriver.class)
    @Select("SELECT * FROM blogs WHERE id = <@p value=id/>")
    Blog selectBlog(@Param("id") int id);
}
