package com.wang.dao;

import java.util.List;

import com.wang.model.Kecheng;

public interface KechengDao {

	// 增加
	public void add(Kecheng kecheng);

	// 删除
	public void delete(Kecheng kecheng);

	// 修改
	public void update(Kecheng kecheng);

	// 查询
	public List select(Kecheng kecheng);

	// 查询所有
	public List selectAll();

}
