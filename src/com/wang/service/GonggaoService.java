package com.wang.service;

import java.util.List;

import com.wang.model.Gonggao;

public interface GonggaoService {

	// ����
	public boolean add(Gonggao gonggao);

	// ɾ��
	public boolean delete(Gonggao gonggao);

	// �޸�
	public boolean update(Gonggao gonggao);

	// ��ѯ
	public Gonggao select(Gonggao gonggao);

	// ��ѯ����
	public List selectAll();

}
