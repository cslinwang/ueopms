package com.wang.service;

import java.util.List;

import com.wang.model.Dati;

public interface DatiService {

	// 增加
	public boolean add(Dati dati);

	// 删除
	public boolean delete(Dati dati);

	// 修改
	public boolean update(Dati dati);

	// 查询
	public Dati select(Dati dati);

	// 查询所有
	public List selectAll();

}
