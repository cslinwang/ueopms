package com.wang.dao;

import java.util.List;

import com.wang.model.Dati;

public interface DatiDao {

	// ����
	public void add(Dati dati);

	// ɾ��
	public void delete(Dati dati);

	// �޸�
	public void update(Dati dati);

	// ��ѯ
	public List select(Dati dati);

	// ��ѯ����
	public List selectAll();

}
