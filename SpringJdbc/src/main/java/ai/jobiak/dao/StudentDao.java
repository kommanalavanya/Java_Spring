package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
    private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	public int insertRow() {
		return jdbctemplate.update("insert into placement values(102,'Ritchel','TCS',30000)");
				
	}
}
