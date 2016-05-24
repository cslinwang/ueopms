package com.wang.dao;

import java.util.List;

import com.wang.model.Chengji;

public interface ChengjiDao {

	// 增加
	public void add(Chengji chengji);

	// 删除
	public void delete(Chengji chengji);

	// 修改
	public void update(Chengji chengji);

	// 查询
	public List select(Chengji chengji);

	// 查询所有
	public List selectAll();

}
