package com.navi.furpnt.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.navi.furpnt.model.Customer;
import com.navi.furpnt.model.Item;
import com.navi.furpnt.service.CategoryService;
import com.navi.furpnt.service.CustomerService;
import com.navi.furpnt.service.ItemService;

import javafx.collections.ModifiableObservableListBase;

@Controller
public class HomeController {
	@Autowired
	CustomerService service;
	@Autowired
	ItemService itemservice;
	@Autowired
	CategoryService categoryService;
	/*@Autowired
	CategoryService categoryService;*/
	//this is the first request method for home//
	@RequestMapping("/")
	public ModelAndView home()
	{
		System.out.println("home() metod called");
		return  new ModelAndView("home");
	}
	@RequestMapping("/home")
	public ModelAndView home1()
	{
		System.out.println("home() metod called");
		return  new ModelAndView("home");
	}
	//this is the second request method for signin//
	@RequestMapping("/signIn")
	public ModelAndView singInp()
	{
	System.out.println("sign in  metod called");
	return new ModelAndView("signin"); 
	}
	@RequestMapping("/aboutus")
	public ModelAndView Aboutus()
	{
	System.out.println("aboutus in  metod called");
	return new ModelAndView("aboutus"); 
	}
	@RequestMapping("/contactus")
	public ModelAndView Contactus()
	{
	System.out.println("contactus in  metod called");
	return new ModelAndView("contactus"); 
	}
	
	//this is the third request method for signup//
	@RequestMapping("/signUp")
	public ModelAndView signUp(){
		Customer customer=new Customer();
		System.out.println("signup is called");
		return new ModelAndView("signup","customerobj",customer);	
	}
	@RequestMapping("/login")
	public String loginMethod()
	{
		return "login";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
		System.out.println("logout page called");

		return "logout";
		
	}
	 @RequestMapping("/CustomerCheck")
	 public ModelAndView customerCheck(Principal principal ) throws JsonGenerationException, JsonMappingException, IOException
	 {	
		System.out.println("UserName:"+principal.getName());
		List<Item> list = itemservice.viewitems();
		System.out.println(list);
		ObjectMapper mapper = new ObjectMapper();
		String ListJSON = mapper.writeValueAsString(list);
		System.out.println(ListJSON);
		return new ModelAndView("customerhome", "listofitem", ListJSON);
	 }
	 @RequestMapping("/AdminCheck")
	 public ModelAndView adminCheck(Principal principal )
	 {
		System.out.println("UserName:"+principal.getName());
		return new ModelAndView("adminhome");
	 }
	@RequestMapping("/register")
	//@valid for validation of customer
	public ModelAndView register(@Valid@ModelAttribute("customerobj") Customer customer,BindingResult bindingresult)
	{
		if(bindingresult.hasErrors()){
			return new ModelAndView("signup");
		}
		System.out.println("UserName:"+customer.getUsername());
		System.out.println("Password:"+customer.getPassword());
		service.addCustomer(customer);
		return new ModelAndView("signup");

	}
	@RequestMapping("/viewItem")
	public ModelAndView selectedItem(@RequestParam("id") String id)
	{
		Item item = itemservice.getItembyId(Integer.parseInt(id));
		return new ModelAndView("SelectedItem","singleKey",item);
	}
	/*@RequestMapping("/viewcategory")
	 public ModelAndView  descategory(@RequestParam("category") String category) throws JsonGenerationException, JsonMappingException, IOException
	 {
		List<Item> list=categoryService.getProductByCategory(category);
		ObjectMapper mapper = new ObjectMapper();
		String ListJSON = mapper.writeValueAsString(list);
		return new ModelAndView("categorypage","cat",ListJSON);
		
		
	 }*/
	@RequestMapping("/viewcategory")
	public ModelAndView cat(@RequestParam("category") String category) throws JsonGenerationException, JsonMappingException, IOException
	{
	System.out.println(category);
	List<Item> list=categoryService.getProductByCategory(category);
	ObjectMapper mapper = new ObjectMapper();
	String ListJSON = mapper.writeValueAsString(list);
	return new ModelAndView("categorypage","cat",ListJSON);
	}
}