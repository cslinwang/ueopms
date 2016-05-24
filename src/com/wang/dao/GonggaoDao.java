package com.wang.dao;

import java.util.List;

import com.wang.model.Gonggao;

;

public interface GonggaoDao {

	// 增加
	public void add(Gonggao gonggao);

	// 删除
	public void delete(Gonggao gonggao);

	// 修改
	public void update(Gonggao gonggao);

	// 查询
	public List select(Gonggao gonggao);

	// 查询所有
	public List selectAll();

}
