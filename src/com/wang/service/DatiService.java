package com.wang.service;

import java.util.List;

import com.wang.model.Dati;

public interface DatiService {

	// ����
	public boolean add(Dati dati);

	// ɾ��
	public boolean delete(Dati dati);

	// �޸�
	public boolean update(Dati dati);

	// ��ѯ
	public Dati select(Dati dati);

	// ��ѯ����
	public List selectAll();

}
