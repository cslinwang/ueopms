package com.wang.service;

import java.util.List;

import com.wang.model.Quanxian;

public interface QuanxianService {

	// ����
	public boolean add(Quanxian quanxian);

	// ɾ��
	public boolean delete(Quanxian quanxian);

	// �޸�
	public boolean update(Quanxian quanxian);

	// ��ѯ
	public Quanxian select(Quanxian quanxian);

	// ��ѯ����
	public List selectAll();

}
