package com.wang.service;

import java.util.List;

import com.wang.model.Gonggao;

public interface GonggaoService {

	// 增加
	public boolean add(Gonggao gonggao);

	// 删除
	public boolean delete(Gonggao gonggao);

	// 修改
	public boolean update(Gonggao gonggao);

	// 查询
	public Gonggao select(Gonggao gonggao);

	// 查询所有
	public List selectAll();

}
