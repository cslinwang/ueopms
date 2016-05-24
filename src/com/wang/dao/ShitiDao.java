package com.wang.dao;

import java.util.List;

import com.wang.model.Shiti;

public interface ShitiDao {

	// 增加
	public void add(Shiti shiti);

	// 删除
	public void delete(Shiti shiti);

	// 修改
	public void update(Shiti shiti);

	// 查询
	public List select(Shiti shiti);

	// 查询所有
	public List selectAll();

}
