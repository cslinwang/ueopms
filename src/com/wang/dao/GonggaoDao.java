package com.wang.dao;

import java.util.List;

import com.wang.model.Gonggao;

;

public interface GonggaoDao {

	// ����
	public void add(Gonggao gonggao);

	// ɾ��
	public void delete(Gonggao gonggao);

	// �޸�
	public void update(Gonggao gonggao);

	// ��ѯ
	public List select(Gonggao gonggao);

	// ��ѯ����
	public List selectAll();

}
