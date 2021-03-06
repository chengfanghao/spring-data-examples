/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.jdbc.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.core.DataAccessStrategy;
import org.springframework.data.jdbc.mapping.model.JdbcMappingContext;
import org.springframework.data.jdbc.mybatis.MyBatisDataAccessStrategy;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 * @author Jens Schauder
 */
@Configuration
@EnableJdbcRepositories
public class MyBatisConfiguration {

	@Bean
	DataAccessStrategy defaultDataAccessStrategy(JdbcMappingContext context, SqlSession sqlSession) {
		return MyBatisDataAccessStrategy.createCombinedAccessStrategy(context, sqlSession);
	}
}
