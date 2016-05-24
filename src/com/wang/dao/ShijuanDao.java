package com.wang.dao;

import java.util.List;

import com.wang.model.Shijuan;

public interface ShijuanDao {

	// 增加
	public void add(Shijuan shijuan);

	// 删除
	public void delete(Shijuan shijuan);

	// 修改
	public void update(Shijuan shijuan);

	// 查询
	public List select(Shijuan shijuan);

	// 查询所有
	public List selectAll();

}
