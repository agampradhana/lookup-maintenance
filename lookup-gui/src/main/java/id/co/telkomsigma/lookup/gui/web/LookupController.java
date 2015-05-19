package id.co.telkomsigma.lookup.gui.web;

import id.co.telkomsigma.lookup.gui.entity.LookupHeaderEntity;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lookup")
public class LookupController {
	@RequestMapping("/maintenance")
	public String maintenance(Model model){
		
		return "template";
	}
	
	@RequestMapping("/getall")
	public String getall(Model model){
		ArrayList<LookupHeaderEntity> masterHeader= new ArrayList<LookupHeaderEntity>();
		
		LookupHeaderEntity header= new LookupHeaderEntity();
		header.setCode("RELIGION");
		header.setDescription("Religion");
		header.setStatus("A");
		
		masterHeader.add(header);
		
		model.addAttribute("headers",header);
		
		return "table-lookup-header";
	}
}
