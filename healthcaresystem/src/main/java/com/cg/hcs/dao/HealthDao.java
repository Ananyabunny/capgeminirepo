package com.cg.hcs.dao;
import java.util.Date;
import java.util.List;

import com.cg.hcs.bean.DiagnosticCenter;
import com.cg.hcs.bean.Test;
import com.cg.hcs.bean.User;
import com.cg.hcs.exception.HealthException;

public interface HealthDao {
	 public	String addTest(String centerName,Test test) throws HealthException;
	 public	boolean removeTest(Test test) throws HealthException;


	 
}