package io.naburnham.springbootstarter.facetoface;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facetoface")
public class FaceToFace {

	@Id
	private String id;
	private String beginDate;
	private String endDate;
	private String courseId;
	private String buildingName;
	private String buildingRoom;
	
	public FaceToFace() {
		
	}
	
	public FaceToFace(String id, String beginDate, String endDate, String courseId, String buildingName,
			String buildingRoom) {
		super();
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.courseId = courseId;
		this.buildingName = buildingName;
		this.buildingRoom = buildingRoom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingRoom() {
		return buildingRoom;
	}

	public void setBuildingRoom(String buildingRoom) {
		this.buildingRoom = buildingRoom;
	}	
}
