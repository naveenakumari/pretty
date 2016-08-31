package com.navi.furpnt.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.navi.furpnt.model.Customer;
import com.navi.furpnt.model.Item;
import com.navi.furpnt.service.CustomerService;
import com.navi.furpnt.service.ItemService;

@Controller
public class AdminController {
	private static final String list = null;
	@Autowired
	CustomerService c;
	@Autowired
	ItemService itemService;
	@Autowired
	

	@RequestMapping("/ViewCustomer")
	public ModelAndView viewcustomer() throws JsonGenerationException, JsonMappingException, IOException {
		List<Customer> list = c.viewcustomer();
		ObjectMapper mapper = new ObjectMapper();
		String ListJSON = mapper.writeValueAsString(list);
		System.out.println(ListJSON);
		return new ModelAndView("viewcustomer", "listofcustomer", ListJSON);

	}

	@RequestMapping("/additem")
	public ModelAndView addItem() {
		Item item = new Item();
		return new ModelAndView("addItem", "i", item);
	}
	@RequestMapping("/addProduct")
	public String addMyItem(@Valid @ModelAttribute("i") Item item, @RequestParam("file") MultipartFile file,
			BindingResult bindingResult) throws IllegalStateException, IOException {
		itemService.addItem(item);
		MultipartFile itemimage = item.getFile();
		Path path = Paths.get("F://niit//workspace6//furpnt//src//main//webapp//WEB-INF//resources//images//"
				+ item.getItemId() + ".jpg");
		if (itemimage != null && !itemimage.isEmpty()) {
			itemimage.transferTo(new File(path.toString()));
			System.out.println("image added");
		}
		System.out.println("Item Name:" + item.getItemName());
		return "redirect:/Viewitems";
	}
	@RequestMapping("/updateItem")
	public  String updateItem(@RequestParam("itemName")String name){
		System.out.println("edited item name:"+name);
		return null; 
	}
	@RequestMapping("/Viewitems")
	public ModelAndView viewitems() throws JsonGenerationException, JsonMappingException, IOException {
		List<Item> item = itemService.viewitems();
		System.out.println("list:" + list);
		ObjectMapper mapper = new ObjectMapper();
		String itemJSON = mapper.writeValueAsString(item);
		System.out.println("JSON data:" + itemJSON);
		return new ModelAndView("viewItem", "listofitem", itemJSON);
	}
	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("id")int id){
		itemService.deleteItem(id);
		return "redirect:/Viewitems";
	
}
	@RequestMapping("/editItem")
	public ModelAndView edititem(@RequestParam("id") int id){
		System.out.println("id"+id);
		Item item=itemService.getItembyId(id);
		System.out.println("iten name:"+item.getItemName());
		
		return new ModelAndView("edititem","item",item);
		
	}
	
	
	@RequestMapping("/updatemyItem")
	public String updateprod(@RequestParam("itemId") String itemId,@RequestParam("itemName") String itemName,
			@RequestParam("description") String description,@RequestParam("category") String category,@RequestParam("price")String price)
		{
		
			int id=Integer.parseInt(itemId);
			Item item=itemService.getItembyId(id);
			item.setItemName(itemName);
			item.setDescription(description);
			item.setCategory(category);
			item.setPrice(Float.parseFloat(price));
			itemService.updateItem(item);
			
			
		
		return "redirect:/Viewitems";
}
	
	

}

