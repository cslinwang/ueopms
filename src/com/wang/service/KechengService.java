package com.wang.service;

import java.util.List;

import com.wang.model.Kecheng;

public interface KechengService {

	// 增加
	public boolean add(Kecheng kecheng);

	// 删除
	public boolean delete(Kecheng kecheng);

	// 修改
	public boolean update(Kecheng kecheng);

	// 查询
	public Kecheng select(Kecheng kecheng);

	// 查询所有
	public List selectAll();

}
