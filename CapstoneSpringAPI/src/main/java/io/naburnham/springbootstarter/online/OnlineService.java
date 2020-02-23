package io.naburnham.springbootstarter.online;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.naburnham.springbootstarter.exceptions.NotFoundException;

@Service
public class OnlineService {

	@Autowired
	private OnlineRepository onlineRepository;
	
	public Page<Online> getAllOnline(int page, int size) {
		Pageable pageable = PageRequest.of(page-1, size);
		
		return onlineRepository.findAll(pageable);
	}
	
	public Optional<Online> getOnlineById(String id) {
		
		Optional<Online> online = onlineRepository.findById(id);

		if (online.isPresent()) {
			return online;			
		} else {
			throw new NotFoundException(id);
		}
	}
	
	public void addOrUpdateOnline(Online online) {
		onlineRepository.save(online);
	}
	
	public void deleteOnline(String id) {
		onlineRepository.deleteById(id);
	}
}
