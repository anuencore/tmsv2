package com.encoress.tms.repository;

import org.springframework.stereotype.Repository;

import com.encoress.tms.domain.entity.User;
import com.encoress.tms.repository.base.BaseRepository;

@Repository
public interface UserRepository extends BaseRepository<User, Long>{

}
