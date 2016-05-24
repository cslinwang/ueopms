package com.wang.dao;

import java.util.List;

import com.wang.model.Juan;

public interface JuanDao {

	// 增加
	public void add(Juan juan);

	// 删除
	public void delete(Juan juan);

	// 修改
	public void update(Juan juan);

	// 查询
	public List select(Juan juan);

	// 查询所有
	public List selectAll();

}
