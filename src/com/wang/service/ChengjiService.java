package com.wang.service;

import java.util.List;

import com.wang.model.Chengji;

public interface ChengjiService {

	// ����
	public boolean add(Chengji chengji);

	// ɾ��
	public boolean delete(Chengji chengji);

	// �޸�
	public boolean update(Chengji chengji);

	// ��ѯ
	public Chengji select(Chengji chengji);

	// ��ѯ����
	public List selectAll();

}
