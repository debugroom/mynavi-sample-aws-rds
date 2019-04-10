package org.debugroom.mynavi.sample.aws.rds.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.debugroom.mynavi.sample.aws.rds.domain.model.entity.Email;
import org.debugroom.mynavi.sample.aws.rds.domain.model.entity.EmailPK;

public interface EmailRepository extends JpaRepository<Email, EmailPK> {
}
