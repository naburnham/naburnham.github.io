package io.naburnham.springbootstarter.facetoface;

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
public class FaceToFaceController {

	@Autowired
	private FaceToFaceService faceToFaceService;
	
	@RequestMapping(method=RequestMethod.GET, value="/facetoface")
	public Page<FaceToFace> getAllFaceToFace(@RequestParam  (defaultValue = "1") int page, @RequestParam (defaultValue = "5") int size) {
		return faceToFaceService.getAllFaceToFace(page, size);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/facetoface/{id}")
	public Optional<FaceToFace> getFaceToFaceById(@PathVariable String id) {
		return faceToFaceService.getFaceToFaceById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/facetoface")
	public void addFaceToFace(@RequestBody FaceToFace faceToFace) {
		faceToFaceService.addOrUpdateFaceToFace(faceToFace);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/facetoface")
	public void updateOnline(@RequestBody FaceToFace faceToFace) {
		faceToFaceService.addOrUpdateFaceToFace(faceToFace);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="facetoface/{id}")
	public void deleteFaceToFace(@PathVariable String id) {
		faceToFaceService.deleteFaceToFace(id);
	}
}
