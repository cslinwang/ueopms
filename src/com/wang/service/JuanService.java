package com.wang.service;

import java.util.List;

import com.wang.model.Juan;

public interface JuanService {

	// ����
	public boolean add(Juan juan);

	// ɾ��
	public boolean delete(Juan juan);

	// �޸�
	public boolean update(Juan juan);

	// ��ѯ
	public Juan select(Juan juan);

	// ��ѯ����
	public List selectAll();

}
