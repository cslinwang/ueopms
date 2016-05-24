package com.wang.dao;

import java.util.List;

import com.wang.model.Yonghu;

public interface YonghuDao {
	// 登录
	public List login(Yonghu yonghu);

	// 增加
	public void add(Yonghu yonghu);

	// 删除
	public void delete(Yonghu yonghu);

	// 修改
	public void update(Yonghu yonghu);

	// 查询
	public List select(Yonghu yonghu);

	// 查询所有
	public List selectAll();

}
