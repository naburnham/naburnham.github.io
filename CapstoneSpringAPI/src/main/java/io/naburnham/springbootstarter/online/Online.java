package io.naburnham.springbootstarter.online;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onlines")
public class Online {
	
	@Id
	private String id;
	private String beginDate;
	private String endDate;
	private String courseId;
	private String url;
	private String browser;
	
	public Online() {
		
	}
	
	public Online(String id, String beginDate, String endDate, String courseId, String url, String browser) {
		super();
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.courseId = courseId;
		this.url = url;
		this.browser = browser;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	
}
