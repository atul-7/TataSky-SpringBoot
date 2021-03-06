package com.cg.apps.tataskyapp.servicerequest.dto;

import java.time.LocalDate;

import com.cg.apps.tataskyapp.servicerequest.entities.ServiceRequest;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ServiceRequestTo {

	private Long id;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate requestedDate;

	private Boolean statusOpened;
	
//	private String message;


//	public String getMessage() {
//		return message;
//	}


	public Long getId() {
		return id;
	}

	public LocalDate getRequestedDate() {
		return requestedDate;
	}

	public Boolean getStatusOpened() {
		return statusOpened;
	}

	public ServiceRequestTo(ServiceRequest sReq) {
		this.id = sReq.getId();
		this.requestedDate = sReq.getRequestedDate();
		this.statusOpened = sReq.getStatusOpened();
//		this.message=sReq.getMessage();
	}

}
