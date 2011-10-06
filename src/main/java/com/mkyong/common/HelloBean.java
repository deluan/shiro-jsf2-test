package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public List getItems() {
        List<String> res = new ArrayList<String>();
        res.add("111111");
        res.add("222222");

        return res;
    }
}