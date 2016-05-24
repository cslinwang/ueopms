package com.wang.dao;

import java.util.List;

import com.wang.model.Dati;

public interface DatiDao {

	// 增加
	public void add(Dati dati);

	// 删除
	public void delete(Dati dati);

	// 修改
	public void update(Dati dati);

	// 查询
	public List select(Dati dati);

	// 查询所有
	public List selectAll();

}
