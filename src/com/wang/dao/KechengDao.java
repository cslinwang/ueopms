package com.wang.dao;

import java.util.List;

import com.wang.model.Kecheng;

public interface KechengDao {

	// ����
	public void add(Kecheng kecheng);

	// ɾ��
	public void delete(Kecheng kecheng);

	// �޸�
	public void update(Kecheng kecheng);

	// ��ѯ
	public List select(Kecheng kecheng);

	// ��ѯ����
	public List selectAll();

}
