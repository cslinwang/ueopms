package com.wang.service;

import java.util.List;

import com.wang.model.Shiti;

public interface ShitiService {

	// ����
	public boolean add(Shiti shiti);

	// ɾ��
	public boolean delete(Shiti shiti);

	// �޸�
	public boolean update(Shiti shiti);

	// ��ѯ
	public Shiti select(Shiti shiti);

	// ��ѯ����
	public List selectAll();

}
