package com.wang.dao;

import java.util.List;

import com.wang.model.Shiti;

public interface ShitiDao {

	// ����
	public void add(Shiti shiti);

	// ɾ��
	public void delete(Shiti shiti);

	// �޸�
	public void update(Shiti shiti);

	// ��ѯ
	public List select(Shiti shiti);

	// ��ѯ����
	public List selectAll();

}
