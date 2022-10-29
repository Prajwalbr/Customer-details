package com.praju.myspringapp.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praju.myspringapp.entities.Myspringapp;
import com.praju.myspringapp.repos.MyspringappRepository;

import antlr.collections.List;

@RestController
public class myspringappcontroller 
{
	private static String myspringappController;

	@Autowired
	MyspringappRepository repository;
	
	private static final org.slf4j.Logger LOGGER =LoggerFactory.getLogger(myspringappcontroller.class);
	@RequestMapping(value="/myspringapp",method=RequestMethod.GET)
	public List getMyspringapp()
	{ 
		return repository.findAll();

	
	}@RequestMapping(value="/myspringapp/{id}",method=RequestMethod.GET)
	public Myspringapp getMyspringapp(@PathVariable("id")int id)
	{
		LOGGER.info("hey");
		return repository.findById(long) id).get();
	}
	@RequestMapping(value="/customers",method=RequestMethod.POST)
	public Myspringapp createMyspringapp(Myspringapp myspringapp) {
		return repository.save(myspringapp);
	}
	@RequestMapping(value="/customers",method=RequestMethod.PUT)
	public Myspringapp updateMyspringapp(Myspringapp myspringapp)
	{
		return JpaRepository.save(myspringapp);
	}
	@RequestMapping(value="/customers",method=RequestMethod.DELETE)
	public void deleteMyspringapp(@PathVariable("id")int id)
	{
		repository.deleteById((long)id);
	}
	
	
			
	

}

