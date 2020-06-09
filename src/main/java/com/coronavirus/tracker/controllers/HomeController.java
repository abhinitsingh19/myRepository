package com.coronavirus.tracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coronavirus.tracker.service.CoronaVirusDataService;

import models.locationStats.LocationStats;

@Controller
public class HomeController 
{
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model)
	{	
		List<LocationStats> allStats= coronaVirusDataService.getAllStats();
//		int totalReportedCases =allStats.stream().mapToInt(stat->stat.getLatestTotalCases()).sum();
		
		int totalReportedCases=0;
		for(LocationStats stats:allStats)
		{
			totalReportedCases +=stats.getLatestTotalCases();
		}
		
		int totalNewCases=0;
		for(LocationStats stats:allStats)
		{
			totalNewCases +=stats.getDiffFromPrevDay();
		}
		System.out.println("totalReportedCases>>>>>>>>"+totalReportedCases);
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		model.addAttribute("totalNewCases", totalNewCases);
		return "home";
	}

}

