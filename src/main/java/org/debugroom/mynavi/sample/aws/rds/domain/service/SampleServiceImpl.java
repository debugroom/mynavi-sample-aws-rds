package org.debugroom.mynavi.sample.aws.rds.domain.service;

import org.debugroom.mynavi.sample.aws.rds.domain.model.entity.*;
import org.debugroom.mynavi.sample.aws.rds.domain.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

@Transactional
@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    GroupRepository groupRepository;

    @Override
    public void init(){
        userRepository.deleteAll();
        groupRepository.deleteAll();
    }

    private Timestamp now(){
        return new Timestamp(System.currentTimeMillis());
    }

    @Override
    public void setData() {

        init();
        Group group1 = Group.builder()
                .groupId(0)
                .groupName("mynavi-group1")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Group group2 = Group.builder()
                .groupId(1)
                .groupName("mynavi-group2")
                .ver(0)
                .lastUpdatedAt(now())
                .build();

        groupRepository.saveAll(Arrays.asList(new Group[]{group1, group2}));

        Address address1 = Address.builder()
                .userId(0)
                .zipCode("100-0000")
                .address("Tokyo Chiyodaku")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Address address2 = Address.builder()
                .userId(1)
                .zipCode("100-0000")
                .address("Tokyo Chuouku")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Email email1 = Email.builder()
                .userId(0)
                .emailNo(0)
                .email("test@test.com")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Email email2 = Email.builder()
                .userId(0)
                .emailNo(1)
                .email("test1@test.com")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Email email3 = Email.builder()
                .userId(1)
                .emailNo(0)
                .email("test2@test.com")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Email email4 = Email.builder()
                .userId(1)
                .emailNo(1)
                .email("test3@test.com")
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Membership membership1 = Membership.builder()
                .groupId(0)
                .userId(0)
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Membership membership2 = Membership.builder()
                .groupId(1)
                .userId(0)
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        Membership membership3 = Membership.builder()
                .groupId(0)
                .userId(1)
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        User user1 = User.builder()
                .userId(0)
                .firstName("taro")
                .familyName("mynavi")
                .loginId("taro-account")
                .isLogin(false)
                .addressByUserId(address1)
                .emailsByUserId(Arrays.asList(new Email[]{email1, email2}))
                .membershipsByUserId(Arrays.asList(new Membership[]{membership1, membership2}))
                .ver(0)
                .lastUpdatedAt(now())
                .build();
        User user2 = User.builder()
                .userId(1)
                .firstName("hanako")
                .familyName("mynavi")
                .loginId("hanako-account")
                .isLogin(false)
                .addressByUserId(address2)
                .emailsByUserId(Arrays.asList(new Email[]{email3, email4}))
                .membershipsByUserId(Arrays.asList(new Membership[]{membership3}))
                .ver(0)
                .lastUpdatedAt(now())
                .build();

        userRepository.saveAll(Arrays.asList(new User[]{user1, user2}));

    }

}
