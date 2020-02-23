package io.naburnham.springbootstarter.facetoface;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.naburnham.springbootstarter.exceptions.NotFoundException;

@Service
public class FaceToFaceService {

	@Autowired
	private FaceToFaceRepository faceToFaceRepository;
	
	public Page<FaceToFace> getAllFaceToFace(int page, int size) {
		Pageable pageable = PageRequest.of(page-1, size);
		
		return faceToFaceRepository.findAll(pageable);
	}
	
	public Optional<FaceToFace> getFaceToFaceById(String id) {
		
		Optional<FaceToFace> faceToFace = faceToFaceRepository.findById(id);

		if (faceToFace.isPresent()) {
			return faceToFace;			
		} else {
			throw new NotFoundException(id);
		}
	}
	
	public void addOrUpdateFaceToFace(FaceToFace faceToFace) {
		faceToFaceRepository.save(faceToFace);
	}
	
	public void deleteFaceToFace(String id) {
		faceToFaceRepository.deleteById(id);
	}
}
