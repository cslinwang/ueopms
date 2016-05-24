package com.wang.dao;

import java.util.List;

import com.wang.model.Jxnr;

public interface JxnrDao {

	// 增加
	public void add(Jxnr jxnr);

	// 删除
	public void delete(Jxnr jxnr);

	// 修改
	public void update(Jxnr jxnr);

	// 查询
	public List select(Jxnr jxnr);

	// 查询所有
	public List selectAll();

}
