package org.debugroom.mynavi.sample.aws.rds.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.debugroom.mynavi.sample.aws.rds.domain.model.entity.Membership;
import org.debugroom.mynavi.sample.aws.rds.domain.model.entity.MembershipPK;

public interface MembershipRepository extends JpaRepository<Membership, MembershipPK> {
}
