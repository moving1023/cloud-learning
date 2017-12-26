package com.liyl.repository;

import com.liyl.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @Author: 李毅霖.
 * @Description:
 * @Date: 2017/12/27
 * @Modified by .
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	@RestResource(path = "name", rel = "name")
	User findByNameStartsWith(@Param("name") String name);
}
