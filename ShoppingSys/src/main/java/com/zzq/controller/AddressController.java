package com.zzq.controller;

import java.util.List;

import javax.sound.midi.MidiDevice.Info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzq.entity.Address;
import com.zzq.entity.City;
import com.zzq.entity.County;
import com.zzq.entity.Province;
import com.zzq.entity.Region;
import com.zzq.service.AddressService;
import com.zzq.service.CityService;
import com.zzq.service.CountyService;
import com.zzq.service.ProvinceService;
import com.zzq.service.RegionService;

@Controller
@RequestMapping
public class AddressController {
	@Autowired
	AddressService addressService;
	@Autowired
	ProvinceService provinceService;
	@Autowired
	CityService cityService;
	@Autowired
	CountyService countyService;
	@Autowired 
	RegionService regionService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Address> address = addressService.find();
		List<Province> province = provinceService.find();
		List<City> city = cityService.find();
		List<County> county = countyService.find();
		List<Region> region = regionService.find();
		
		model.addAttribute("address", address);
		model.addAttribute("province", province);
		model.addAttribute("city", city);
		model.addAttribute("county", county);
		model.addAttribute("region", region);
		return "address";	
	}
	
	@RequestMapping("/save")
	public String save(Address address,Model model) {
		addressService.add(address);
		return "redirect:list";
	}
	@RequestMapping("/info")
	public String Info(int id,Model model) {
		Address info = addressService.findById(id);
		model.addAttribute("info", info);
		return "redirect:update";
	}
	@RequestMapping("/update")
	public String update(Address address,Model model) {
		addressService.update(address);
		return "redirect:list";
	}
}
