package com.wang.service;

import java.util.List;

import com.wang.model.Jxnr;

public interface JxnrService {

	// 增加
	public boolean add(Jxnr jxnr);

	// 删除
	public boolean delete(Jxnr jxnr);

	// 修改
	public boolean update(Jxnr jxnr);

	// 查询
	public Jxnr select(Jxnr jxnr);

	// 查询所有
	public List selectAll();

}
