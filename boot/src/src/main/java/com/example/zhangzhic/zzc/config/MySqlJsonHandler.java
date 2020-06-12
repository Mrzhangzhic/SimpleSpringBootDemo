/*

package com.example.zhangzhic.zzc.config;
import com.alibaba.fastjson.JSONObject;

import io.github.yidasanqian.utils.JsonUtil;
import net.sf.json.JSONObject.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(JSONObject.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MySqlJsonHandler<T> extends BaseTypeHandler<T> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Object parameter,
                                    JdbcType jdbcType) throws SQLException {
        ps.setString(i, JsonUtil.toJson(parameter));
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        String data = rs.getString(columnName);
        return StringUtils.isBlank(data) ? null : JsonUtil.fromJson(data, (Class<T>) getRawType());
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String data = rs.getString(columnIndex);
        return StringUtils.isBlank(data) ? null : JsonUtil.fromJson(data, (Class<T>) getRawType());
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        String data = cs.getString(columnIndex);
        return StringUtils.isBlank(data) ? null : JsonUtil.fromJson(data, (Class<T>) getRawType());
    }

}

*/
