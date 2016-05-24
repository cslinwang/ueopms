package com.wang.service;

import java.util.List;

import com.wang.model.Yonghu;

public interface YonghuService {
	// 登陆
	public Yonghu login(Yonghu yonghu);

	// 增加
	public boolean add(Yonghu yonghu);

	// 删除
	public boolean delete(Yonghu yonghu);

	// 修改
	public boolean update(Yonghu yonghu);

	// 查询
	public Yonghu select(Yonghu yonghu);

	// 查询所有
	public List selectAll();

}
