package com.trademanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trademanagement.model.Trade;

public interface TradeRepository extends JpaRepository<Trade, Long> {

}
