package com.wang.service;

import java.util.List;

import com.wang.model.Shijuan;

public interface ShijuanService {

	// 增加
	public boolean add(Shijuan shijuan);

	// 删除
	public boolean delete(Shijuan shijuan);

	// 修改
	public boolean update(Shijuan shijuan);

	// 查询
	public Shijuan select(Shijuan shijuan);

	// 查询所有
	public List selectAll();

}
