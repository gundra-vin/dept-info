package com.gundra.deptinfo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gundra.deptinfo.model.Dept;

@RestController
public class DeptController {
	
	
	@GetMapping("/deptdetails")
	public List<Dept> deptDetails(){
		return deptLst();
	}
	
	@GetMapping("/getDept/{deptId}")
	public Dept getDept(@PathVariable("deptId") Integer deptId ){
		
		return deptMap().get(deptId);
		
	}
	
	public List<Dept> deptLst(){
		Dept d1 = new Dept(1,"Civil");
		Dept d2 = new Dept(2,"Mech");
		List<Dept> dptlst = new ArrayList<Dept>();
		dptlst.add(d1);
		dptlst.add(d2);
		return dptlst;
	}
	
	public Map<Integer, Dept> deptMap(){
		Dept d1 = new Dept(1,"Civil");
		Dept d2 = new Dept(2,"Mech");
		
		Map<Integer, Dept> deptMap = new HashMap<Integer, Dept>();
		deptMap.put(d1.getDeptId(), d1);
		deptMap.put(d2.getDeptId(), d2);
		return deptMap;
	}


}
