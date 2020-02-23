package io.naburnham.springbootstarter.online;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineController {
	
	@Autowired
	private OnlineService onlineService;
	
	@RequestMapping(method=RequestMethod.GET, value="/online")
	public Page<Online> getAllOnline(@RequestParam  (defaultValue = "1") int page, @RequestParam (defaultValue = "5") int size) {
		return onlineService.getAllOnline(page, size);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/online/{id}")
	public Optional<Online> getOnlineById(@PathVariable String id) {
		return onlineService.getOnlineById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/online")
	public void addOnline(@RequestBody Online online) {
		onlineService.addOrUpdateOnline(online);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/online")
	public void updateOnline(@RequestBody Online online) {
		onlineService.addOrUpdateOnline(online);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="online/{id}")
	public void deleteOnline(@PathVariable String id) {
		onlineService.deleteOnline(id);
	}
}
