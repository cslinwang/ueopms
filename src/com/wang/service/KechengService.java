package com.wang.service;

import java.util.List;

import com.wang.model.Kecheng;

public interface KechengService {

	// ����
	public boolean add(Kecheng kecheng);

	// ɾ��
	public boolean delete(Kecheng kecheng);

	// �޸�
	public boolean update(Kecheng kecheng);

	// ��ѯ
	public Kecheng select(Kecheng kecheng);

	// ��ѯ����
	public List selectAll();

}
