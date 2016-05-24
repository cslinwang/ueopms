package com.wang.service;

import java.util.List;

import com.wang.model.Juan;

public interface JuanService {

	// 增加
	public boolean add(Juan juan);

	// 删除
	public boolean delete(Juan juan);

	// 修改
	public boolean update(Juan juan);

	// 查询
	public Juan select(Juan juan);

	// 查询所有
	public List selectAll();

}
