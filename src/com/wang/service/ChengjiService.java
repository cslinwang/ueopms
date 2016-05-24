package com.wang.service;

import java.util.List;

import com.wang.model.Chengji;

public interface ChengjiService {

	// 增加
	public boolean add(Chengji chengji);

	// 删除
	public boolean delete(Chengji chengji);

	// 修改
	public boolean update(Chengji chengji);

	// 查询
	public Chengji select(Chengji chengji);

	// 查询所有
	public List selectAll();

}
