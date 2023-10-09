package com.containz.containz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.containz.containz.model.Referral;


public interface ReferralRepository extends JpaRepository<Referral, Long> {
    List<Referral> findByReferrerId(long referrerId);


}