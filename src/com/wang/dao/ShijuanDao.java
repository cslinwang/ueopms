package com.wang.dao;

import java.util.List;

import com.wang.model.Shijuan;

public interface ShijuanDao {

	// ����
	public void add(Shijuan shijuan);

	// ɾ��
	public void delete(Shijuan shijuan);

	// �޸�
	public void update(Shijuan shijuan);

	// ��ѯ
	public List select(Shijuan shijuan);

	// ��ѯ����
	public List selectAll();

}
