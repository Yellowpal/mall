package win.yellowpal.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import win.yellowpal.mall.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	
	@RequestMapping("/list")
	public String list(Model model){
		
		model.addAttribute("list", itemService.listAll());
		
		return "item/list";
	}
	
	@RequestMapping("/detail/{id}")
	public String detail(Model model,@PathVariable("id")long id){
		
		model.addAttribute("item", itemService.getById(id));
		
		return "item/detail";
	}
}
