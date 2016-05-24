package com.wang.service;

import java.util.List;

import com.wang.model.Quanxian;

public interface QuanxianService {

	// 增加
	public boolean add(Quanxian quanxian);

	// 删除
	public boolean delete(Quanxian quanxian);

	// 修改
	public boolean update(Quanxian quanxian);

	// 查询
	public Quanxian select(Quanxian quanxian);

	// 查询所有
	public List selectAll();

}
