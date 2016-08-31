package com.navi.furpnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.navi.furpnt.model.Cart;
import com.navi.furpnt.model.CartItem;
import com.navi.furpnt.model.Customer;
import com.navi.furpnt.model.Item;
import com.navi.furpnt.service.CartItemService;
import com.navi.furpnt.service.CustomerService;
import com.navi.furpnt.service.ItemService;

@Controller
public class CartController {
	@Autowired
	ItemService i;
	
@Autowired
CustomerService customerService;
@Autowired
CartItemService cartItemService;
@RequestMapping("/addtocart")
public String additems(@RequestParam("id") String id){
	System.out.println("cart controller= " +  id);
	String loggedInUserName=SecurityContextHolder.getContext().getAuthentication().getName();
	
	Customer customer=customerService.getCustomerByName(loggedInUserName);
	System.out.println("after get customer by name=" +customer);
	Cart cart=customer.getCart();
	CartItem cartitem=new CartItem();
	
	Item item=i.getItembyId(Integer.parseInt(id));
	cartitem.setItem(item);
	cartitem.setQuantity(1);
	cartitem.setTotalprice(item.getPrice());
	cartItemService.addCartitem(cartitem);
	System.out.println("item added cart controller");
	return "redirect:/CustomerCheck";
}


}
