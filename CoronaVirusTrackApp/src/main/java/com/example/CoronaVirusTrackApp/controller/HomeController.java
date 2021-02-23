package com.example.CoronaVirusTrackApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.CoronaVirusTrackApp.models.LocationStats;
import com.example.CoronaVirusTrackApp.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService corona;

	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = corona.getAllStats();
	        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
	        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
	        model.addAttribute("locationStats", allStats);
	        model.addAttribute("totalReportedCases", totalReportedCases);
	        model.addAttribute("totalNewCases", totalNewCases);

	        return "home";
	}
}
