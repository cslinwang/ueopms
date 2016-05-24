package com.wang.dao;

import java.util.List;

import com.wang.model.Quanxian;

;

public interface QuanxianDao {

	// 增加
	public void add(Quanxian quanxian);

	// 删除
	public void delete(Quanxian quanxian);

	// 修改
	public void update(Quanxian quanxian);

	// 查询
	public List select(Quanxian quanxian);

	// 查询所有
	public List selectAll();

}
