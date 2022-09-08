package com.fachex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fachex.dao.FachexDao;

@Service
public class FachexService {
	
	@Autowired
	FachexDao fachexDao;

}
