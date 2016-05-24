package com.wang.service;

import java.util.List;

import com.wang.model.Shiti;

public interface ShitiService {

	// 增加
	public boolean add(Shiti shiti);

	// 删除
	public boolean delete(Shiti shiti);

	// 修改
	public boolean update(Shiti shiti);

	// 查询
	public Shiti select(Shiti shiti);

	// 查询所有
	public List selectAll();

}
