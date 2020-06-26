package com.trademanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trademanagement.model.Trade;

@Controller
public class AppController {

	@Autowired
	private TradeService service; 
	
	@RequestMapping("/")
	public List<Trade> viewHomePage(Model model) {
		List<Trade> listTrade = service.listAll();
		model.addAttribute("listTrade", listTrade);
		
		return listTrade;
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Trade trade = new Trade();
		model.addAttribute("trade", trade);
		
		return "new_trade";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_trade");
		Trade trade = service.get(id);
		mav.addObject("trade", trade);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public int deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return id;		
	}
}
