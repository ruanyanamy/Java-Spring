package com.systex.eBiz.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TimeService {

	public String getTime() {
		return new Date().toString();
	}
}
