package com.wang.dao;

import java.util.List;

import com.wang.model.Juan;

public interface JuanDao {

	// ����
	public void add(Juan juan);

	// ɾ��
	public void delete(Juan juan);

	// �޸�
	public void update(Juan juan);

	// ��ѯ
	public List select(Juan juan);

	// ��ѯ����
	public List selectAll();

}
