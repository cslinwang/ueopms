package com.wang.dao;

import java.util.List;

import com.wang.model.Quanxian;

;

public interface QuanxianDao {

	// ����
	public void add(Quanxian quanxian);

	// ɾ��
	public void delete(Quanxian quanxian);

	// �޸�
	public void update(Quanxian quanxian);

	// ��ѯ
	public List select(Quanxian quanxian);

	// ��ѯ����
	public List selectAll();

}
