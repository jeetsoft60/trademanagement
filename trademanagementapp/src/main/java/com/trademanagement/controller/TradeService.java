package com.trademanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trademanagement.model.Trade;
import com.trademanagement.repository.TradeRepository;

@Service
@Transactional
public class TradeService {

	@Autowired
	private TradeRepository trepo;
	
	
	public void delete(long id) {
		trepo.deleteById(id);
	}
	
	public List<Trade> listAll() {
		return trepo.findAll();
	}
	
	public Trade get(long id) {
		return trepo.findById(id).get();
	}
}
