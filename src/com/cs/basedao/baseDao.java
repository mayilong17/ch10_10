package com.cs.basedao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SuppressWarnings("all")
public class baseDao {
    private static JdbcTemplate template = null;
    static {
        Properties pro = new Properties();
        InputStream is = baseDao.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
            template = new JdbcTemplate(dataSource);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static JdbcTemplate getTemplate(){
        return template;
    }
}
