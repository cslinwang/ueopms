package com.wang.dao;

import java.util.List;

import com.wang.model.Chengji;

public interface ChengjiDao {

	// ����
	public void add(Chengji chengji);

	// ɾ��
	public void delete(Chengji chengji);

	// �޸�
	public void update(Chengji chengji);

	// ��ѯ
	public List select(Chengji chengji);

	// ��ѯ����
	public List selectAll();

}
