package org.debugroom.mynavi.sample.aws.rds.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.debugroom.mynavi.sample.aws.rds.domain.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
