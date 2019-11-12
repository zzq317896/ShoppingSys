package com.zzq.controller;

import java.util.List;

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

/**
 * 地址控制类
 * @author 李金艳
 * 2019年11月12日 上午8:18:23
 */
@Controller
@RequestMapping
public class AddressController {
	@Autowired
	AddressService aService;
	@Autowired
	ProvinceService pService;
	@Autowired
	CityService cService;
	@Autowired
	CountyService countyService;
	@Autowired
	RegionService rService;
	@RequestMapping("/list")
	public String list(Model model) {
		List<Address> address=aService.find();
		List<Province> pro=pService.find();
		List<City> city= cService.find();
		List<County> county= countyService.find();
		List<Region> region= rService.find();

		model.addAttribute("pro", pro);
		model.addAttribute("address", address);
		model.addAttribute("city", city);
		model.addAttribute("county", county);
		model.addAttribute("region", region);
		return "address";
	}
	@RequestMapping("/add")
	public String add(Model model) {
		List<Address> address=aService.find();
		List<Province> pro=pService.find();
		List<City> city= cService.find();
		List<County> county= countyService.find();
		List<Region> region= rService.find();

		model.addAttribute("pro", pro);
		model.addAttribute("address", address);
		model.addAttribute("city", city);
		model.addAttribute("county", county);
		model.addAttribute("region", region);
		return "address";
	}
	@RequestMapping("save")
	public String save(Address address,Model model) {
		int res=aService.add(address);
		if (res>0) {
			model.addAttribute("sucess", "保存成功");
		}else {
			model.addAttribute("sucess", "保存失败");
		}
		return "address";
	}
	
}
