package com.wang.service;

import java.util.List;

import com.wang.model.Shijuan;

public interface ShijuanService {

	// ����
	public boolean add(Shijuan shijuan);

	// ɾ��
	public boolean delete(Shijuan shijuan);

	// �޸�
	public boolean update(Shijuan shijuan);

	// ��ѯ
	public Shijuan select(Shijuan shijuan);

	// ��ѯ����
	public List selectAll();

}
