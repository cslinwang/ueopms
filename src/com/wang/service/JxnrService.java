package com.wang.service;

import java.util.List;

import com.wang.model.Jxnr;

public interface JxnrService {

	// ����
	public boolean add(Jxnr jxnr);

	// ɾ��
	public boolean delete(Jxnr jxnr);

	// �޸�
	public boolean update(Jxnr jxnr);

	// ��ѯ
	public Jxnr select(Jxnr jxnr);

	// ��ѯ����
	public List selectAll();

}
